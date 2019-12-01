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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    DatabaseReference mDatabase;
    EditText editText1, editText2;
    //String sfName1="myFile1",sfName2="myFile2";  //값을 저장할 두개의 파일

    SharedPreferences sharedPreferences;
SharedPreferences sf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");

        Button saveBtn=(Button) findViewById(R.id.saveBtn);
        final EditText tall = (EditText) findViewById(R.id.tallEdit);
        final EditText weight= (EditText) findViewById(R.id.weightEdit);
        //result = (TextView) findViewById(R.id.text);

        if(sf3!=null){
            Intent intent=new Intent(MainActivity.this,MenuActivity.class);
            startActivity(intent);
        }

        sf3=getSharedPreferences("water",MODE_PRIVATE);
        int cheight=sf3.getInt("height",0);
        int cweight=sf3.getInt("weight",0);
        TextView tx1=(TextView)findViewById(R.id.tallEdit) ;
        TextView tx2=(TextView)findViewById(R.id.weightEdit);
        tx1.setText(String.valueOf(cheight));
        tx2.setText(String.valueOf(cweight));

        sharedPreferences = getSharedPreferences("water", MODE_PRIVATE);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            // 확인 버튼 클릭 시 데이터 저장
            @Override
            public void onClick(View v) {
                String sheight = tall.getText().toString();
                String sweight = weight.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("height", Integer.parseInt(sheight));
                editor.putInt("weight", Integer.parseInt(sweight));
                editor.commit();

                Toast.makeText(MainActivity.this, "저장 완료", Toast.LENGTH_SHORT).show();
            }
        });


        findViewById(R.id.nextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });


    }
}