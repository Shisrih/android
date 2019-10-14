package com.example.androidclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.rgSubject);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
              if(i == R.id.radio1){
                  Toast.makeText(Main2Activity.this, "Android", Toast.LENGTH_SHORT).show();
              }

                else if(i == R.id.radio2){
                    Toast.makeText(Main2Activity.this, "IOS", Toast.LENGTH_SHORT).show();
                }


                else if(i == R.id.radio3){
                    Toast.makeText(Main2Activity.this, "Windows", Toast.LENGTH_SHORT).show();
                }

                else if(i == R.id.radio4){
                    Toast.makeText(Main2Activity.this, "Fuisha", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
