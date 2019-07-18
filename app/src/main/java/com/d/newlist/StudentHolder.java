package com.d.newlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class StudentHolder extends RecyclerView.ViewHolder {

    public TextView tvId,tvName;


    public StudentHolder(@NonNull View itemView) {
        super(itemView);

        tvId = itemView.findViewById(R.id.tvId);
        tvName = itemView.findViewById(R.id.tvName);
    }
}
