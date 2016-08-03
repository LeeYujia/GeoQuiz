package com.example.msi.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends Activity{
    private Button back;
    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);
        Log.i("sp2","i am page2");
        back =(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent mainintent = new Intent(IntroActivity.this,MainActivity.class);
                startActivity(mainintent);
//                IntroActivity.this.finish();
            }
        });

    }
}
