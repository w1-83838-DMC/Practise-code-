package com.sunbeaminfo.app1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    private static final String TAG="MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_SCREEN_ON))
            Log.e(TAG,"Screen ON");
        else
            Log.e(TAG,"Screen OFF");
    }
}