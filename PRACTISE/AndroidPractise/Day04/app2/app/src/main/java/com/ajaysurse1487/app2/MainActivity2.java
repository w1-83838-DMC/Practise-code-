package com.ajaysurse1487.app2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView texthello,textsunbeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        texthello=findViewById(R.id.texthello);
        texthello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                PopupMenu popupMenu= new PopupMenu(MainActivity2.this,view);
                popupMenu.getMenu().add("Edit");
                popupMenu.getMenu().add("Delete");
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getTitle().equals("Edit"))
                            Toast.makeText(MainActivity2.this, "edit", Toast.LENGTH_SHORT).show();
                        else if(item.getTitle().equals("Delete"))
                            Toast.makeText(MainActivity2.this, "Delete", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                return false;
            }
        });

        textsunbeam=findViewById(R.id.textsunbeam);
        textsunbeam.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view){
                PopupMenu popupMenu = new PopupMenu(MainActivity2.this,view);
                popupMenu.getMenu().add("Edit");
                popupMenu.getMenu().add("Delete");
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                       if(item.getTitle().equals("Edit"))
                           Toast.makeText(MainActivity2.this, "Edit ", Toast.LENGTH_SHORT).show();
                       else if(item.getTitle().equals("Delete"))
                           Toast.makeText(MainActivity2.this, "Delete", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                return false;
            }
        });




    }
}