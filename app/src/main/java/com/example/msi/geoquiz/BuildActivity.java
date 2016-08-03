package com.example.msi.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by MSI on 2016/8/3.
 */
public class BuildActivity extends Activity{
    private Button bback;
    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service);
        bback =(Button)findViewById(R.id.sback);
        bback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent mainintent = new Intent(BuildActivity.this,MainActivity.class);
                startActivity(mainintent);
                BuildActivity.this.finish();
            }
        });

    }
}
