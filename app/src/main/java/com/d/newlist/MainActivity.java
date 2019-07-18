package com.d.newlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> studentList = new ArrayList<>();


        for (int i = 0; i < 30; i++) {
            Student student1 = new Student();

            student1.id = "PH0495" + i;
            student1.name = "An Nam";

            studentList.add(student1);
        }

        rvList = findViewById(R.id.rvList);

        StudentAdapter studentAdapter = new StudentAdapter(this, studentList);

        rvList.setAdapter(studentAdapter);

        // layout theo chieu doc

        LinearLayoutManager vertical = new LinearLayoutManager(MainActivity.this);

        // layout theo chieu ngang

        LinearLayoutManager horizontal = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);


        // grid dang luoi


        GridLayoutManager vertical_grid =
                new GridLayoutManager(this, 3);


        GridLayoutManager horizontal_grid =
                new GridLayoutManager(this, 3,
                        LinearLayoutManager.HORIZONTAL, false);


        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        rvList.setLayoutManager(staggeredGridLayoutManager);


    }
}
