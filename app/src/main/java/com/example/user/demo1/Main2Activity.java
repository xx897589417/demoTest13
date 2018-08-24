package com.example.user.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private ImageView imageView;
    private LinearLayout linearLayout;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private LinearLayout linearLayout3;
    private ImageView imageView2;
    private TextView textView13;
    private LinearLayout linearLayout4;
    private ImageView imageView3;
    private TextView textView14;
    private LinearLayout linearLayout5;
    private ImageView imageView4;
    private TextView textView15;
    private LinearLayout linearLayout6;
    private ImageView imageView5;
    private LinearLayout linearLayout7;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        linearLayout3 = (LinearLayout) findViewById(R.id.linearLayout3);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        textView13 = (TextView) findViewById(R.id.textView13);
        linearLayout4 = (LinearLayout) findViewById(R.id.linearLayout4);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        textView14 = (TextView) findViewById(R.id.textView14);
        linearLayout5 = (LinearLayout) findViewById(R.id.linearLayout5);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        textView15 = (TextView) findViewById(R.id.textView15);
        linearLayout6 = (LinearLayout) findViewById(R.id.linearLayout6);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        linearLayout7 = (LinearLayout) findViewById(R.id.linearLayout7);
        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                Intent intent = new Intent(Main2Activity.this, ShiPeiActivity.class);
                startActivity(intent);
                break;
            case R.id.imageView:
                finish();
                break;
        }
    }
}
