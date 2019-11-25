package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import  android.widget.TextView;
import android.widget.Toast;


public class WalkingActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor stepDetectorSensor;
    private Sensor stepCountSensor;
    private  int mStepDetector;
    TextView stepDetect;
    TextView stepCount;
    ProgressBar progressBar;
    TextView step;
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking);
        // SensorManager 인스턴스를 가져옴
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        // Detector
        // stepDetect = (TextView)findViewById(R.id.stepDetect);
        stepDetectorSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR);
        if (stepDetectorSensor == null) {
            Toast.makeText(this, "No Step Detect Sensor", Toast.LENGTH_SHORT).show();
        }
        // Counter
        stepCount = (TextView)findViewById(R.id.stepCount);
        stepCountSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if (stepCountSensor == null) {
            Toast.makeText(this, "No Step Detect Sensor", Toast.LENGTH_SHORT).show();
        }
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //value += 1000;
        //progressBar.setProgress(value);
//            }
//        });

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setMax(10000);
        step = (TextView)findViewById(R.id.stepCount);

    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, stepDetectorSensor, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, stepCountSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
/*

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }
*/

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_STEP_DETECTOR) {
            if (event.values[0] == 1.0f) {
                mStepDetector += event.values[0];
//                stepDetect.setText("Step Detect : " + String.valueOf(mStepDetector));
            }
        }
        else if (event.sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
            stepCount.setText(String.valueOf(event.values[0]) + " / 10000");
            progressBar.setProgress((int)event.values[0]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}


