package com.sunbeaminfo.admin.activity;

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

import com.sunbeaminfo.admin.R;
import com.sunbeaminfo.admin.dbhelper.MobiledbHelper;
import com.sunbeaminfo.admin.entity.Mobile;

public class EditMobileActivity extends AppCompatActivity {

    TextView textName;
    EditText editPrice,editDesc;

    Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit_mobile);
        textName=findViewById(R.id.textName);
        editPrice=findViewById(R.id.editPrice);
        editDesc=findViewById(R.id.editDesc);
        Intent intent=getIntent();
        mobile=(Mobile) intent.getSerializableExtra("mobile");
        textName.setText(mobile.getName());
        editPrice.setText(""+mobile.getPrice());
        editDesc.setText(mobile.getDesc());
    }

    public void update(View view)
    {
        mobile.setPrice(Double.parseDouble(editPrice.getText().toString()));
        mobile.setDesc(editDesc.getText().toString());
        MobiledbHelper mobiledbHelper=new MobiledbHelper(this);
        mobiledbHelper.updateMobile(mobile);
        finish();
    }
}