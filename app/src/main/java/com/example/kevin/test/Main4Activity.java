package com.example.kevin.test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main4Activity extends FragmentActivity{
    public ViewPager vp1;
    public static String next;
    public EditText e3;
    public frag ff1 = new frag();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        FragmentManager fm = getFragmentManager();
        sections sec1  = new sections(getSupportFragmentManager());
        vp1 = (ViewPager)findViewById(R.id.vp);

        Fragment f1 = fm.findFragmentById(R.id.fcont);
        if(f1==null){
            f1 = new frag();
            fm.beginTransaction()
            .add(R.id.fcont,f1,"f1")
            .commit();

        }
        next= ff1.mgets();

        System.out.print(next);
        if(next=="23")
        {
            Fragment f2;
            fm.popBackStackImmediate("f1",0);
            f2 = new frag2();
            fm.beginTransaction().add(R.id.fcont,f2).commit();
        }

    }


    public void setupViewPager(ViewPager vp1)
    {
        sections adapter = new sections(getSupportFragmentManager());
        adapter.addFragment(new android.support.v4.app.Fragment(),"fragement1");
        vp1.setAdapter(adapter);
    }

    public void setViewPager(int f1){
        vp1.setCurrentItem(f1);
    }
}
