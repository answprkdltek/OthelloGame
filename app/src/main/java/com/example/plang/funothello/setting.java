package com.example.plang.funothello;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button bgm_on = findViewById(R.id.bgm_on);
        bgm_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배경음 on", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), BGMService.class);
                startService(intent);

            }
        });
        Button bgm_off = findViewById(R.id.bgm_off);
        bgm_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배경음 off", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), BGMService.class);
                stopService(intent);
            }
        });
        Button eff_on = findViewById(R.id.eff_on);
        eff_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "효과음 on", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), effectService.class);
                startService(intent);
            }
        });
        Button eff_off = findViewById(R.id.eff_off);
        eff_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "효과음 off", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), effectService.class);
                stopService(intent);
            }
        });
    }
}
