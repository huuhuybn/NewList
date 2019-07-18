package com.d.newlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentHolder> {

    private Context context;

    private List<Student> studentList;

    public StudentAdapter(Context context, List<Student> studentList) {

        this.context = context;

        this.studentList = studentList;

    }


    @NonNull
    @Override
    public StudentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view =
                LayoutInflater.from(context).
                        inflate(R.layout.student, viewGroup, false);

        StudentHolder student = new StudentHolder(view);

        return student;
    }

    @Override
    public void onBindViewHolder(@NonNull final StudentHolder studentHolder, int position) {

        final Student student = studentList.get(position);

        studentHolder.tvId.setText(student.id);
        studentHolder.tvName.setText(student.name);


        studentHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,
                        "Item Click " + studentHolder.getAdapterPosition(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        studentHolder.tvId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,
                        "Item Click " + student.id,
                        Toast.LENGTH_SHORT).show();
            }
        });


        studentHolder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,
                        "Item Click " + student.name,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
