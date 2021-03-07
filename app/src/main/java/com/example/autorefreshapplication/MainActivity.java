package com.example.autorefreshapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Runnable refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Handler handler = new Handler();
       refresh = new Runnable() {
           @Override
           public void run() {
               handler.postDelayed(refresh,5000);
               Toast.makeText(MainActivity.this, "auto refresh", Toast.LENGTH_SHORT).show();
           }
       };
        handler.post(refresh);
    }
}