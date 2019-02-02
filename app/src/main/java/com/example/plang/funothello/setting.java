package com.example.plang.funothello;

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

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.main_theme);

        final SoundPool effect = new SoundPool(1, AudioManager.STREAM_ALARM, 0);
        final int bubbleSound = effect.load(this, R.raw.effect_sound, 1);
        final int streamId = effect.play(bubbleSound, 1.0F, 1.0F, 1, -1, 1.0F);
        Button bgm_on = findViewById(R.id.bgm_on);
        bgm_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배경음 on", Toast.LENGTH_LONG).show();

            }
        });
        Button bgm_off = findViewById(R.id.bgm_off);
        bgm_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배경음 off", Toast.LENGTH_LONG).show();
            }
        });
        Button eff_on = findViewById(R.id.eff_on);
        eff_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "효과음 on", Toast.LENGTH_LONG).show();
                effect.play(bubbleSound, 1.0F, 1.0F, 1, 0, 1.0F);
            }
        });
        Button eff_off = findViewById(R.id.eff_off);
        eff_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "효과음 off", Toast.LENGTH_LONG).show();
                effect.stop(streamId);
            }
        });
    }
}
