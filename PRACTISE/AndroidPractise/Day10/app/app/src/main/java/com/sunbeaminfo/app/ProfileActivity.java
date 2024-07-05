package com.sunbeaminfo.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProfileActivity extends AppCompatActivity {

    TextView textEmail;

    EditText editName,editPassword,editMobile;

    int userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editName=findViewById(R.id.editName);
        editPassword=findViewById(R.id.editPassword);
        editMobile=findViewById(R.id.editMobile);
        textEmail=findViewById(R.id.textEmail);
        getUserById();
    }
    public void getUserById()
    {
         userId=getSharedPreferences("user_status",MODE_PRIVATE).getInt("userId",0);
        new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class)
                .getUserById(userId)
                .enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        JsonObject jsonObject=response.body().getAsJsonObject("data");
                        //Log.e("jsonObject",""+jsonObject);
                        if(jsonObject!=null) {
                            textEmail.setText(jsonObject.get("email").getAsString());
                            editName.setText(jsonObject.get("name").getAsString());
                            editPassword.setText(jsonObject.get("password").getAsString());
                            editMobile.setText(jsonObject.get("mobile").getAsString());
                        } else {
                            Toast.makeText(ProfileActivity.this, "Data not found", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable throwable) {
                        Toast.makeText(ProfileActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();

                    }
                });

    }

    public void updateProfile(View view)
    {
        User user= new User();
        user.setName(editName.getText().toString());
        user.setPassword(editPassword.getText().toString());
        user.setMobile(editMobile.getText().toString());
        user.setEmail(textEmail.getText().toString());

        new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class)
                .updateUser(user,userId)
                .enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        finish();
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable throwable) {
                        Toast.makeText(ProfileActivity.this, "Something went wrong updating ", Toast.LENGTH_SHORT).show();

                    }
                });


    }
}