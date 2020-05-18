package com.example.tema3;

import android.app.usage.UsageEvents;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentViewHolder> {


    private List<Student> students;

    public StudentsAdapter(List<Student> students) {

        this.students = students;

    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.studentview, parent, false);
        return new StudentViewHolder(studentItem);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent = students.get(position);
        holder.getTextViewFirstName().setText(currentStudent.getFirstName());
        holder.getTextViewLastName().setText(currentStudent.getLastName());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
