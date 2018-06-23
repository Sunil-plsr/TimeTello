package com.plsr.sunil.timetello;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by sunil on 6/23/18.
 */

public class ScreenReceiver extends BroadcastReceiver {

    public static boolean isScreenOn = true;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // DO WHATEVER YOU NEED TO DO HERE
            isScreenOn = false;
            Log.d("bla", "ONN");
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // AND DO WHATEVER YOU NEED TO DO HERE
            isScreenOn = true;
            Log.d("bla", "OFFF");
        }
    }
}
