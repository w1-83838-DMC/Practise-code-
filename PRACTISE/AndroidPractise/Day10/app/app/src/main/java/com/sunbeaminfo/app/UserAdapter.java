package com.sunbeaminfo.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.UserviewHolder>{

    Context context;

    List<User>userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }


    @NonNull
    @Override
    public UserviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_user,null);
        return new UserviewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull UserviewHolder holder, int position) {
        holder.textName.setText(userList.get(position).getName());
        holder.textMobile.setText(userList.get(position).getMobile());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserviewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{
        TextView textName,textMobile;
        public UserviewHolder(@NonNull View itemView) {
            super(itemView);
            textName=itemView.findViewById(R.id.textName);
            textMobile=itemView.findViewById(R.id.textMobile);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public boolean onLongClick(View view) {
            PopupMenu popupMenu= new PopupMenu(context,view);
            popupMenu.getMenu().add("Delete");
            popupMenu.show();

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    new Retrofit.Builder()
                            .baseUrl(Api.BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                            .create(Api.class)
                            .deleteUser(userList.get(getAdapterPosition()).getId())
                            .enqueue(new Callback<JsonObject>() {
                                @Override
                                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                                    userList.remove(getAdapterPosition());
                                    UserAdapter.this.notifyDataSetChanged();
                                }

                                @Override
                                public void onFailure(Call<JsonObject> call, Throwable throwable) {
                                    Toast.makeText(context, "Something went wrong ", Toast.LENGTH_SHORT).show();

                                }
                            });

                    return false;
                }
            });
            return false;
        }
    }
}
