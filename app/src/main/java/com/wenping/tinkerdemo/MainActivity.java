package com.wenping.tinkerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                debug();
                resolveBug();
            }
        });

        findViewById(R.id.btn_content_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "currentVersionName: "+BuildConfig.VERSION_NAME+"flaver:"+BuildConfig.FLAVOR, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void resolveBug() {
        Toast.makeText(MainActivity.this, "bug被解决了,currentVersionName: "+BuildConfig.VERSION_NAME+"flaver:"+BuildConfig.FLAVOR, Toast.LENGTH_LONG).show();

    }

    private void debug() {
        int i = 100/0;
    }
}
