package com.example.kevin.test;

import android.widget.Button;

public class events {


    public String ename;
    public String edes;
    public Button edel;
    public Button eview;

    public events(String ename, String edes,Button edel,Button eview) {
        this.ename = ename;
        this.edes = edes;
        this.edel = edel;
        this.eview = eview;

    }


    public String getEname() {
        return ename;
    }

    public String getEdes() {
        return edes;
    }

}
