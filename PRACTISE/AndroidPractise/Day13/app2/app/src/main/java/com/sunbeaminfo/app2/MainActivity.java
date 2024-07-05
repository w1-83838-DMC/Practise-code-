package com.sunbeaminfo.app2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);

        SensorManager sensorManager=getSystemService(SensorManager.class);

        Sensor sensor= sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        SensorEventListener eventListener= new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                float x=event.values[0];
                float y=event.values[1];
                float z=event.values[2];

                Log.e("Sensor",x+","+y+","+z);
                imageView.setX(x*20);
                imageView.setY(y*20);
                imageView.setZ(z*20);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };
        sensorManager.registerListener(eventListener,sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }
}