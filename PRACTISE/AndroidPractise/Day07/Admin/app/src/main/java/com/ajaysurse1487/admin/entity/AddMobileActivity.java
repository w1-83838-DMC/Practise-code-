package com.ajaysurse1487.admin.entity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ajaysurse1487.admin.R;
import com.ajaysurse1487.admin.dbhelper.MobileDbHelper;

public class AddMobileActivity extends AppCompatActivity {

    EditText editName,editPrice,editDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mobile);
        editName=findViewById(R.id.editName);
        editPrice=findViewById(R.id.editPrice);
        editDesc=findViewById(R.id.editDesc);
    }

    public void save(View view) {
        Mobile mobile = new Mobile();
        mobile.setName(editName.getText().toString());
        mobile.setPrice(Double.parseDouble(editPrice.getText().toString()));
        mobile.setDesc(editDesc.getText().toString());
        MobileDbHelper dbHelper = new MobileDbHelper(this);
        dbHelper.insertMobile(mobile);
        finish();

    }

}