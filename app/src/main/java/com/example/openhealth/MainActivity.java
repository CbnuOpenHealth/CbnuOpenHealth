package com.example.openhealth;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        // 다음 레이아웃
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}