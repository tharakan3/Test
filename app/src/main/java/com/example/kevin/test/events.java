package com.example.kevin.test;

import android.widget.Button;

public class events {


    public String ename;
    public String edes;
    public Button edel;
    public Button eview;

    public events(String ename, String edes) {
        this.ename = ename;
        this.edes = edes;

    }


    public String getEname() {
        return ename;
    }

    public String getEdes() {
        return edes;
    }

}
