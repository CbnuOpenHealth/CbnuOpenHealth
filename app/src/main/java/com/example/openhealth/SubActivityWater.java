package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class SubActivityWater extends AppCompatActivity {

    SharedPreferences sf;
    Button checkWater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_water);

        TextView tx1=(TextView)findViewById(R.id.setgoal_edt_goal);
        sf=getSharedPreferences("water",MODE_PRIVATE);

        int weight=sf.getInt("weight",0);

       
        //Intent intent=getIntent(); //데이터 수신

       //double water=intent.getExtras().getInt("water");
       tx1.setText(String.valueOf(weight*30));


        checkWater=(Button) findViewById(R.id.setgoal_btn_setgoal);
        checkWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubActivityWater.this,CheckWater.class);
                startActivity(intent);
            }
        });
        }
    }

