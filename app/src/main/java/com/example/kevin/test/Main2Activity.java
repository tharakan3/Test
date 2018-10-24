package com.example.kevin.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public String m = "";
    public TextView set1;
    public Button bt2;
    public int data;
    public Intent i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        set1 = (TextView)findViewById(R.id.txt2);
        bt2 = (Button)findViewById(R.id.bt3);

        i2 = new Intent(getApplicationContext(),MainActivity.class);
        m = getIntent().getStringExtra("arclick");
        set1.setText(m);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data  = 25;
                i2.putExtra("get",data);
                setResult(RESULT_OK,i2);


            }
        });



    }
}
