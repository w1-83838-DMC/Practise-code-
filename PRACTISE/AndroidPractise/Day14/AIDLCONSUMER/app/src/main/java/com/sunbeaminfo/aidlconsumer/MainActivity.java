package com.sunbeaminfo.aidlconsumer;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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

    ServiceConnection serviceConnection= new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            remoteService=IRemoteService.Stub.asInterface(service);

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    public void startService(View view)
    {
        Intent intent= new Intent("myService.AIDL");
        PackageManager packageManager= getPackageManager();
        ResolveInfo resolveInfo=packageManager.resolveService(intent,0);
        ComponentName componentName= new ComponentName(resolveInfo.serviceInfo.packageName,resolveInfo.serviceInfo.name);
        intent.setComponent(componentName);
        bindService(intent,serviceConnection,BIND_AUTO_CREATE);
    }

    public void downloadFile(View view)
    {
        try {
            remoteService.downloadFile();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
    public void StopService(View view)
    {
        unbindService(serviceConnection);
    }
}