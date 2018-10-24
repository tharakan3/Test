package com.example.kevin.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class sections extends FragmentStatePagerAdapter {

    private final List<Fragment> mfrag = new ArrayList<>();
    private final List<String> mtitle = new ArrayList<>();

    public sections(FragmentManager fk) {
        super(fk);
    }
    public void addFragment(Fragment frag, String title)
    {
        mfrag.add(frag);
        mtitle.add(title);
    }
    @Override
    public Fragment getItem(int position) {
        return mfrag.get(position);
    }

    @Override
    public int getCount() {
        return mfrag.size();
    }
}
