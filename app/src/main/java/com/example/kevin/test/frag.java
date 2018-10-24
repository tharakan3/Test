package com.example.kevin.test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class frag extends Fragment {
    public int mInt;
    public EditText medit;
    public TextView mtext;

    public String gets;

    public  String mgets() {
        return gets;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frg,container,false);
        medit = (EditText)v.findViewById(R.id.et1);
        mtext = (TextView)v.findViewById(R.id.in1);

        medit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    mtext.setText("enter another value");
                    frag2 f2 = new frag2();
                    FragmentManager fmi = getFragmentManager();
                    fmi.beginTransaction().add(R.id.fcont,f2,"f2").commit();




            }

            @Override
            public void afterTextChanged(Editable editable) {
                gets = editable.toString();

                if(gets=="1") {

            }

            }
        });
        return v;
    }
}
