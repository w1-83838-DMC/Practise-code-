package com.sunbeaminfo.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import aidl.IRemoteService;

public class MyService extends Service {
    public MyService() {
    }

    IRemoteService.Stub studBinder= new IRemoteService.Stub() {
        @Override
        public void downloadFile() throws RemoteException {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i <= 10; i++) {
                        try {
                            Thread.sleep(1000);
                            Log.e("MyService","Counter"+i);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();
        }
    };

    @Override
    public IBinder onBind(Intent intent){
        return studBinder;
    }
}