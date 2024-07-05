package com.sunbeaminfo.admin.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sunbeaminfo.admin.R;
import com.sunbeaminfo.admin.dbhelper.MobiledbHelper;
import com.sunbeaminfo.admin.entity.Mobile;

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

    public void save(View view)
    {
        Mobile mobile= new Mobile();
        mobile.setName(editName.getText().toString());
        mobile.setPrice(Double.parseDouble(editPrice.getText().toString()));
        mobile.setDesc(editDesc.getText().toString());
        MobiledbHelper mobiledbHelper= new MobiledbHelper(this);
        mobiledbHelper.insertMobile(mobile);
        finish();
    }
}