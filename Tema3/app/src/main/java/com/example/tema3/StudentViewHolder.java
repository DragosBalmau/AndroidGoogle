package com.example.tema3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView firstName;
    private TextView lastName;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName = itemView.findViewById(R.id.textview_first);
        lastName = itemView.findViewById(R.id.textview_lastname);
    }

    public TextView getTextViewFirstName() { return firstName; }

    public TextView getTextViewLastName() { return lastName; }

}
