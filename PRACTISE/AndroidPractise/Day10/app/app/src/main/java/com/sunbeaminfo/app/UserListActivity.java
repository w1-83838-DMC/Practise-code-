package com.sunbeaminfo.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserListActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;

    List<User> userList;

    UserAdapter userAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerView);
        setSupportActionBar(toolbar);
        userList= new ArrayList<>();
        userAdapter= new UserAdapter(this,userList);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        getAllUsers();
    }

    private void getAllUsers()
    {
        new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class)
                .getAllUsers()
                .enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        JsonArray jsonArray=response.body().get("data").getAsJsonArray();
                        for(JsonElement element:jsonArray)
                        {
                           JsonObject jsonObject= element.getAsJsonObject();
                           User user= new User();
                           user.setId(jsonObject.get("id").getAsInt());
                           user.setName(jsonObject.get("name").getAsString());
                           user.setEmail(jsonObject.get("email").getAsString());
                           user.setPassword(jsonObject.get("password").getAsString());
                           user.setMobile(jsonObject.get("mobile").getAsString());
                           userList.add(user);
                        }
                        userAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable throwable) {

                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("profile").setIcon(R.drawable.profile).setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, ProfileActivity.class));
        return super.onOptionsItemSelected(item);

    }
}