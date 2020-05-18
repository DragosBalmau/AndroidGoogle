package com.example.tema3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> students;
    private RecyclerView recyclerViewstudents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        getStudents();
        recyclerViewstudents = this.findViewById(R.id.recyclerviewStudents);
        setLayoutManager(recyclerViewstudents);
        setAdapter(recyclerViewstudents);

    }

    private void getStudents(){

        students = new ArrayList<>();
        Student student = null;
        for(int i = 0; i < 20;  i++){
            student = new Student();
            student.setFirstName("FirstName " + i);
            student.setLastName("LastName " + i);
            students.add(student);
        }
    }

    private void setLayoutManager(RecyclerView recyclerView){

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerView){

        StudentsAdapter studentsAdapter = new StudentsAdapter(students);
        recyclerView.setAdapter(studentsAdapter);
    }
}
