package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //맥박체크
        Button btn_move1=(Button)findViewById(R.id.btn_move1);
        btn_move1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MenuActivity.this ,SubActivity.class);
                startActivity(intent); //액티비티 이동.
                //finish();
            }
        });

        //물마시기
        Button btn_move2=(Button)findViewById(R.id.btn_move2);
        btn_move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MenuActivity.this ,SubActivityWater.class);
                startActivity(intent); //액티비티 이동.
                // finish();
            }
        });

        //운동
        Button btn_move3=(Button)findViewById(R.id.btn_move3);
        btn_move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MenuActivity.this ,WalkingActivity.class);
                startActivity(intent); //액티비티 이동.
                //finish();
            }
        });

        Button retry=(Button)findViewById(R.id.retry);
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
