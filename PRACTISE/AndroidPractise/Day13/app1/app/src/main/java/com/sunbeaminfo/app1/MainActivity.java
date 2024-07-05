package com.sunbeaminfo.app1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void sendNotification(View view) {
        // create Notification Channel
        NotificationChannel notificationChannel = new NotificationChannel("MyChannelId", "MyChannel", NotificationManager.IMPORTANCE_DEFAULT);
        // create the instance of NoticationManager

        NotificationManager notificatioManager = getSystemService(NotificationManager.class);

        // Register the channel With the System
        notificatioManager.createNotificationChannel(notificationChannel);

        // Create the notification
        Notification.Builder builder = new Notification.Builder(this, "MyChannelId");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentTitle("First Notification");
        builder.setContentText("Hello from my First Notification");

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManagerCompat.notify(1, builder.build());

    }

    public void sendExpandedNotification(View view) {
        NotificationChannel notificationChannel = new NotificationChannel("channelId2", "MyChannel12", NotificationManager.IMPORTANCE_DEFAULT);

        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(notificationChannel);

        Notification.Builder builder = new Notification.Builder(this, "channelId2");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentTitle("Second Notification");
        builder.setContentText("Beginning with Android 8.1 (API level 27), apps can't make a notification sound more than once per second. If your app posts multiple notifications in one second, they all appear as expected, but only the first notification per second makes a sound.");
        builder.setStyle(new Notification.BigTextStyle().bigText("Beginning with Android 8.1 (API level 27), apps can't make a notification sound more than once per second. If your app posts multiple notifications in one second, they all appear as expected, but only the first notification per second makes a sound."));


        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        managerCompat.notify(1, builder.build());

    }

    public void sendProgressNotification(View view) {
        NotificationChannel notificationChannel = new NotificationChannel("channelId3", "MyChannel13", NotificationManager.IMPORTANCE_DEFAULT);

        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(notificationChannel);

        Notification.Builder builder = new Notification.Builder(this, "channelId3");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentTitle("Progress Notification");
        builder.setProgress(100, 0, false);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        NotificationManagerCompat.from(this).notify(2, builder.build());

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000);
                        builder.setProgress(100, i * 10, false);
                        if (ActivityCompat.checkSelfPermission(MainActivity.this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {

                            return;
                        }
                        NotificationManagerCompat.from(MainActivity.this).notify(2, builder.build());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                builder.setContentTitle("Download Completed");
                builder.setProgress(0, 0, false);
                NotificationManagerCompat.from(MainActivity.this)
                        .notify(2, builder.build());
            }
        }).start();

    }

    public void sendTapNotification(View view) {
        NotificationChannel notificationChannel = new NotificationChannel("TapId", "TapChannel", NotificationManager.IMPORTANCE_DEFAULT);

        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(notificationChannel);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        Notification.Builder builder = new Notification.Builder(this, "TapId");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentTitle("Tap Notification");
        builder.setContentText("Tap notification to launch secondActivity");
        builder.setContentIntent(pendingIntent);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        NotificationManagerCompat.from(this).notify(1, builder.build());


    }




}