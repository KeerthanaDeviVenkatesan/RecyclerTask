package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<DesignClass> userList;

    public Adapter(List<DesignClass>userList){this.userList=userList;}



    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int image1=userList.get(position).getImageView1();
        String name=userList.get(position).getTextView1();
        String time=userList.get(position).getTextView2();
        String msg=userList.get(position).getTextView3();

        holder.setData(image1,name,time,msg);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;

        public ViewHolder(View itemView){
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView1);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);
        }

        public void setData(int resource, String name, String time,String msg) {

            imageView.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(time);
            textView3.setText(msg);
        }
    }
}
