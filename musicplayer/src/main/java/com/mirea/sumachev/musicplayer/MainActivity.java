package com.mirea.sumachev.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickStart(View view) {

        startService(new Intent(MainActivity.this, PlayerService.class));
    }

    public void OnClickStop(View view) {

        stopService(new Intent(MainActivity.this, PlayerService.class));

    }
}