package com.example.msi.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    private Button intro;
    private Button service;
    private Button build;
    private  Button advant;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intro =(Button)findViewById(R.id.intro);
        service =(Button)findViewById(R.id.service);
        build =(Button)findViewById(R.id.build);
        advant =(Button)findViewById(R.id.advant);
        intro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent introintent = new Intent(MainActivity.this,IntroActivity.class);
                startActivity(introintent);
            }
        });
        service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });
        build.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });
        advant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

    }


}
