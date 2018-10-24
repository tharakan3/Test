package com.example.kevin.test;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class list extends AppCompatActivity {
    public RecyclerView rc1;
    public RecyclerView.Adapter ad1;
    public List<events> le;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rc1 = (RecyclerView)findViewById(R.id.rcv);
        rc1.setHasFixedSize(true);
        rc1.setLayoutManager(new LinearLayoutManager(this));

        le = new ArrayList<>();
        for(int i =0;i<5;i++)
        {
            events e1 = new events(
                    "Event" + (i+1),
                    "Details of Event" + (i+1)

            );
            le.add(e1);

        }
        ad1 = new adapt(le,this);
        rc1.setAdapter(ad1);

    }


}
