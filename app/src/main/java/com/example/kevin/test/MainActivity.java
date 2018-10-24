package com.example.kevin.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public Button bt1;
    public TextView tx1;
    public static int dat2;
    public int flag;
    public Intent i3;
    public Button bt4;
    public Button camerabut;
    public Intent ic;
    public Intent il;
    public Intent mp;
    public Button lbut;
    public Button mbut;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button)findViewById(R.id.bt2);
        tx1 = (TextView)findViewById(R.id.txt1);
        bt4 = (Button)findViewById(R.id.fbt);
        lbut = (Button)findViewById(R.id.lbut);
        camerabut = (Button)findViewById(R.id.cbut);
        if(dat2!=0) {
            tx1.setText(Integer.toString(dat2));

        }
        camerabut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ic = new Intent(getApplicationContext(),camera.class);
            startActivity(ic);
            }
        });

        lbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                il = new Intent(getApplicationContext(),list.class);
                startActivity(il);
            }
        });

        mbut = (Button)findViewById(R.id.mpbut);
        mbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(mp);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                i.putExtra("arclick","wtf");
                startActivityForResult(i, 0);




            }


        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              i3 = new Intent(getApplicationContext(),Main4Activity.class);
              startActivity(i3);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        dat2 = getIntent().getIntExtra("get",0);




    }
}
