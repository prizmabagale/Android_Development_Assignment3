package com.example.assignment3.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment3.R;
import com.example.assignment3.model.DataModel;
import com.example.assignment3.view.CustomAdapter;

public class StudentActivity extends AppCompatActivity {
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        rv = findViewById(R.id.rv);

        DataModel dm = new DataModel();
        String[] names = dm.getNames();
        String[] address = dm.getAddress();
        int[] semester = dm.getSemester();
        String[] faculty = dm.getFaculty();


        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new CustomAdapter(StudentActivity.this,names,address,faculty,semester));
    }
}
