package com.example.plang.funothello;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.IBinder;

public class effectService extends Service {
    public effectService() {
    }

    SoundPool effect = new SoundPool(1, AudioManager.STREAM_ALARM, 0);
    int bubbleSound = effect.load(this, R.raw.effect_sound, 1);
    int streamId = effect.play(bubbleSound, 0.5F, 0.5F, 1, -1, 1.0F);

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
