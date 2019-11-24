package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;

public class InputWater extends AppCompatActivity {

    EditText editText1, editText2;
    //String sfName1="myFile1",sfName2="myFile2";  //값을 저장할 두개의 파일
    Button saveBtn, nextBtn;
    double n1, n2;
    double result;
    //TextView result;
    // TextView Height;
    // TextView Weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_water);
        setTitle("사용자 정보 입력");

        editText1 = (EditText) findViewById(R.id.tallEdit);
        editText2 = (EditText) findViewById(R.id.weightEdit);
        //result = (TextView) findViewById(R.id.text);
        saveBtn = (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            // 확인 버튼 클릭 시 데이터 저장
            @Override
            public void onClick(View v) {
                try{
                    n1 = Double.parseDouble(editText1.getText().toString());
                    n2 = Double.parseDouble(editText2.getText().toString());
                    //result.setText(String.format("%4.2f", (double) (n2  * 30)));
                    result=n2*33;
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "입력란을 채우세요", Toast.LENGTH_SHORT).show();
                }
                Intent intent=new Intent(getApplicationContext(),SubActivityWater.class);
                intent.putExtra("water",result);
                startActivity(intent); //바로 넘어가게 해도될 지 잘 모르겠음
            }
        });


    }
}