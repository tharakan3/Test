package com.example.kevin.test;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.File;

public class camera extends AppCompatActivity {
    public final static int IMAGE_CAPTURED = 1;
    public Button imc;
    public Button ims;
    public Intent ic;
    public Bitmap imageBitmap;
    public ImageView imageView;
    public WebView wvs;
    public String murl = "https://www.google.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        ic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        imc = findViewById(R.id.buttonImageCapture);
        imageView = findViewById(R.id.imageView);
        wvs = (WebView)findViewById(R.id.wv);

        WebView.setWebContentsDebuggingEnabled(true);
        wvs.getSettings().getJavaScriptEnabled();
        wvs.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        wvs.loadUrl(murl);

        imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(ic, IMAGE_CAPTURED);
            }
        });

        ims = findViewById(R.id.buttonImageShow);
        ims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent cameraIntent) {
        if (resultCode == RESULT_OK && requestCode == IMAGE_CAPTURED) {
            Bundle extras = cameraIntent.getExtras();
            if (extras != null) {
                imageBitmap = (Bitmap) extras.get("data");
                imageView.setImageBitmap(imageBitmap);
            }
        }
    }
}
