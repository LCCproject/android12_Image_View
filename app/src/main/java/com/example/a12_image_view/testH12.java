package com.example.a12_image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class testH12 extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h12);
        img = (ImageView)findViewById(R.id.img);
    }
    int i=0;
    public void change(View view) {
        if(i==0){
            img.setImageResource(R.drawable._1);
            i=1;
        }
        else{
            img.setImageResource(R.drawable._2);
            i=0;
        }
    }
}