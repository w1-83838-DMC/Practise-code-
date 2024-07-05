package com.sunbeaminfo.app;

import android.content.Intent;
import android.os.Bundle;
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

public class MainActivity extends AppCompatActivity {
    EditText editEmail,editPassword;
    TextView textRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);
        textRegister=findViewById(R.id.textRegister);
        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterUserActivity.class));
            }
        });
    }
    public void login(View view)
    {
        User user= new User();
        user.setEmail(editEmail.getText().toString());
        user.setPassword(editPassword.getText().toString());

        new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class)
                .loginUser(user)
                .enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        if(response.body().get("status").getAsString().equals("success"))
                        {
                            JsonObject jsonObject=response.body().getAsJsonObject("data");
                            int userId=jsonObject.get("id").getAsInt();
                            // storing the data in the sharedPreference
                            getSharedPreferences("user_status",MODE_PRIVATE)
                                    .edit().putInt("userId",userId).apply();

                            //Toast.makeText(MainActivity.this, "Login Succesfull", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(MainActivity.this, UserListActivity.class));
                        }else
                        {
                            Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable throwable) {
                        Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();

                    }
                });

    }
    public void cancel(View view)
    {
        finish();
    }
}