package com.sunbeaminfo.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import aidl.IRemoteService;

public class MainActivity extends AppCompatActivity {
    IRemoteService remoteService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ServiceConnection serviceConnection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            remoteService=IRemoteService.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }

    };

    public void startservice(View view)
    {
        Intent intent= new Intent(this, MyService.class);
        bindService(intent,serviceConnection,BIND_AUTO_CREATE);
    }
    public void downloadfile(View view)
    {
        try {
            remoteService.downloadFile();
        } catch (RemoteException e) {

        }
    }
    public void StopService(View view)
    {
        unbindService(serviceConnection);
    }
}