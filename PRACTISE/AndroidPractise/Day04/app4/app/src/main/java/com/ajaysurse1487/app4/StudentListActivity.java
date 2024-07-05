package com.ajaysurse1487.app4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {
    Toolbar toolbar;

    List<Student> studentList;

    ListView listView;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        toolbar=findViewById(R.id.toolbar);
        listView=findViewById(R.id.listView);
        setSupportActionBar(toolbar);
        studentList= new ArrayList<>();
        studentList.add(new Student(1,"stu1",50));
        studentList.add(new Student(2,"stu2",60));
        studentList.add(new Student(3,"stu3",70));
        studentList.add(new Student(4,"stu4",80));

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,studentList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(StudentListActivity.this, StudentDetailsActivity.class);
                intent.putExtra("student",studentList.get(position));
                startActivity(intent);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                PopupMenu popupMenu= new PopupMenu(StudentListActivity.this,view);
                popupMenu.getMenu().add("Delete");
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        studentList.remove(position);
                        adapter.notifyDataSetChanged();
                        return false;
                    }
                });
                return false;
            }
        });
    }

    ActivityResultLauncher activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {

            Intent intent=result.getData();
            Student student=(Student)intent.getSerializableExtra("student");
            studentList.add(student);

        }
    });

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent= new Intent(this,InputStudentActivity.class);
        //startActivity(intent);
        activityResultLauncher.launch(intent);
        return super.onOptionsItemSelected(item);
    }
}