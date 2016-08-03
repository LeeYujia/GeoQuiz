package com.example.msi.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiActicity extends Activity{
    private Button sback;
    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service);
        sback =(Button)findViewById(R.id.sback);
        sback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent mainintent = new Intent(ServiActicity.this,MainActivity.class);
                startActivity(mainintent);
                ServiActicity.this.finish();
            }
        });

    }
}
