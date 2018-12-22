package com.plsr.sunil.timetello;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by sunil on 9/25/18.
 */
public class WakeyService extends Service {
    BroadcastReceiver mReceiver;
    public int counter=0;
    public WakeyService(Context applicationContext) {
        super();
        Log.i("bla", "here I am!");
    }

    public WakeyService() {
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        startScreenReceiver();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("bla", "ondestroy!");
        Intent broadcastIntent = new Intent("com.plsr.sunil.KickStart.WakeWakeyService");
        sendBroadcast(broadcastIntent);
        stopScreenReceiver();
    }

    private void startScreenReceiver() {
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        mReceiver = new ScreenReceiver();
        registerReceiver(mReceiver, filter);
    }

    private void stopScreenReceiver() {
        unregisterReceiver(mReceiver);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
