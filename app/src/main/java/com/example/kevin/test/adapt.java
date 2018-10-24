package com.example.kevin.test;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class adapt extends RecyclerView.Adapter<adapt.viewholder> {



    public List<events> listitem;
    public Context cont;


    public adapt(List<events> listitem, Context cont) {
        this.listitem = listitem;
        this.cont = cont;
    }


    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
            return new viewholder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
            events eve = listitem.get(position);
            holder.ename.setText(eve.getEname());
            holder.edel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            holder.eview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        public TextView ename;
        public Button edel;
        public Button eview;

        public viewholder(View itemView) {
            super(itemView);
            ename = (TextView)itemView.findViewById(R.id.ename);
            edel = (Button)itemView.findViewById(R.id.edel);
            eview = (Button)itemView.findViewById(R.id.eview);

        }
    }
}
