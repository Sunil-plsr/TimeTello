package com.plsr.sunil.timetello;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by sunil on 9/25/18.
 */

public class WakeyRestarterBroadcastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, WakeyService.class));;
    }
}
