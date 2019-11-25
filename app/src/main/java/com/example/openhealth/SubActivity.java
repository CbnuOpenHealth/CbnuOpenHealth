package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        final Button pulseButton = (Button) findViewById(R.id.pulseButton);

        pulseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pulseData;


               // RequestPulse requestPulse = new RequestPulse(pulseData, responseListener);
               // RequestQueue queue = Volley.newRequestQueue(SubActivity.this);
               // queue.add(requestPulse);

            }
        });
    }
}
