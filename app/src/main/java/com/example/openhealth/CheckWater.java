package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class CheckWater extends AppCompatActivity {

    TextView tv = null;
    TextView pb;
    Button changeBtn1, changeBtn2, changeBtn3, changeBtn4, changeBtn5 = null;
    int count = 0;
    ProgressBar bar;

    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_water);

        tv=findViewById(R.id.tv);
        changeBtn1=findViewById(R.id.button);

        changeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+125;
                tv.setText(""+count);
                bar=(ProgressBar)findViewById(R.id.progressBar);
                pb=(TextView)findViewById(R.id.textView6);
                int nowValue=bar.getProgress();
                int maxValue=bar.getMax();
                CharSequence str = "";

                if(maxValue == nowValue) {
                    nowValue = 0;
                } else {
                    bar.setVisibility(View.VISIBLE);
                    nowValue += 5;
                }

                if(nowValue == 0){
                    bar.setVisibility(View.GONE);
                    str = "임무완료!";
                } else {
                    str = "클릭을 계속해 주세요." + "[" + nowValue + "]";
                }

                bar.setProgress(nowValue);
                pb.setText(str);

            }
        });
        changeBtn2=findViewById(R.id.btn2);
        changeBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+250;
                tv.setText(""+count);
                bar=(ProgressBar)findViewById(R.id.progressBar);
                pb=(TextView)findViewById(R.id.textView6);
                int nowValue=bar.getProgress();
                int maxValue=bar.getMax();
                CharSequence str = "";

                if(maxValue == nowValue) {
                    nowValue = 0;
                } else {
                    bar.setVisibility(View.VISIBLE);
                    nowValue += 5;
                }

                if(nowValue == 0){
                    bar.setVisibility(View.GONE);
                    str = "임무완료!";
                } else {
                    str = "클릭을 계속해 주세요." + "[" + nowValue + "]";
                }

                bar.setProgress(nowValue);
                pb.setText(str);
            }
        });
        changeBtn3=findViewById(R.id.btn3);
        changeBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+350;
                tv.setText(""+count);
                bar=(ProgressBar)findViewById(R.id.progressBar);
                pb=(TextView)findViewById(R.id.textView6);
                int nowValue=bar.getProgress();
                int maxValue=bar.getMax();
                CharSequence str = "";

                if(maxValue == nowValue) {
                    nowValue = 0;
                } else {
                    bar.setVisibility(View.VISIBLE);
                    nowValue += 5;
                }

                if(nowValue == 0){
                    bar.setVisibility(View.GONE);
                    str = "임무완료!";
                } else {
                    str = "클릭을 계속해 주세요." + "[" + nowValue + "]";
                }

                bar.setProgress(nowValue);
                pb.setText(str);
            }
        });
        changeBtn4=findViewById(R.id.btn4);
        changeBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+500;
                tv.setText(""+count);
                bar=(ProgressBar)findViewById(R.id.progressBar);
                pb=(TextView)findViewById(R.id.textView6);
                int nowValue=bar.getProgress();
                int maxValue=bar.getMax();
                CharSequence str = "";

                if(maxValue == nowValue) {
                    nowValue = 0;
                } else {
                    bar.setVisibility(View.VISIBLE);
                    nowValue += 5;
                }

                if(nowValue == 0){
                    bar.setVisibility(View.GONE);
                    str = "임무완료!";
                } else {
                    str = "클릭을 계속해 주세요." + "[" + nowValue + "]";
                }

                bar.setProgress(nowValue);
                pb.setText(str);
            }
        });
        changeBtn5=findViewById(R.id.btn5);
        changeBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+750;
                tv.setText(""+count);
                bar=(ProgressBar)findViewById(R.id.progressBar);
                pb=(TextView)findViewById(R.id.textView6);
                int nowValue=bar.getProgress();
                int maxValue=bar.getMax();
                CharSequence str = "";

                if(maxValue == nowValue) {
                    nowValue = 0;
                } else {
                    bar.setVisibility(View.VISIBLE);
                    nowValue += 5;
                }

                if(nowValue == 0){
                    bar.setVisibility(View.GONE);
                    str = "임무완료!";
                } else {
                    str = "클릭을 계속해 주세요." + "[" + nowValue + "]";
                }

                bar.setProgress(nowValue);
                pb.setText(str);
            }
        });
    }
}
