## OpenHealth
```java
// MainActivity.java
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView Height;
    TextView Weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Height = findViewById(R.id.Height);
        Weight = findViewById(R.id.Weight);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            // 확인 버튼 클릭 시 데이터 저장
            @Override
            public void onClick(View v) {
                SharedPreferences save_data = getSharedPreferences("data",  MODE_PRIVATE);
                SharedPreferences.Editor editor = save_data.edit();    // 저장하려면 editor가 필요


                // 저장할 값들을 입력함.
                editor.putInt("Height", Integer.parseInt(Height.getText().toString()));
                editor.putInt("Weight", Integer.parseInt(Weight.getText().toString()));
                editor.commit();
            }
        });


        // 데이터 불러오기
        // SharedPreferences 를 불러옴
        SharedPreferences load_data = getSharedPreferences("data", MODE_PRIVATE);

        // 저장된 값들을 불러온다.
        Integer load_Height = load_data.getInt("Height", 0);
        Integer load_Weight = load_data.getInt("Weight", 0);

        if (load_Height != 0 && load_Weight != 0) {
            nextPage();
        }
    }

    private void nextPage() {
        // NextActivty 대신 다음 레이아웃
        Intent intent = new Intent(this, NextActivity.class); 
        startActivity(intent);
    }

}



// activity_main
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/Height"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="96dp"
        android:layout_marginTop="240dp"
        android:ems="10"
        android:hint="키"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/Weight"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="96dp"
        android:layout_marginTop="340dp"
        android:ems="10"
        android:hint="체중"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="160dp"
        android:layout_marginTop="432dp"
        android:text="확인"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
```
