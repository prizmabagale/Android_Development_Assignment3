package com.example.assignment3.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment3.R;
import com.example.assignment3.controller.StudentActivity;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context c;
    String[] myNames, myAddress, myFaculty;
    int[] mySemester;
    public CustomAdapter(StudentActivity s , String[] name, String[] address,String[] faculty, int[] semester){
        c = s;
        myNames = name;
        myAddress = address;
        myFaculty = faculty;
        mySemester = semester;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(c).inflate(R.layout.items,null);
        MyViewHolder viewHolder = new MyViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv1.setText(myNames[position]);
        holder.tv2.setText(myAddress[position]);
        holder.tv3.setText(myFaculty[position]);
        holder.tv4.setText(String.valueOf(mySemester[position]));
    }

    @Override
    public int getItemCount() {
        return myNames.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv1,tv2,tv3,tv4;
        public MyViewHolder(View convertView){
            super(convertView);
            tv1 = convertView.findViewById(R.id.name);
            tv2 = convertView.findViewById(R.id.address);
            tv3 = convertView.findViewById(R.id.faculty);
            tv4 = convertView.findViewById(R.id.semester);

        }
    }
}
