package com.example.androidclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity implements View.OnClickListener{
EditText result;
Button btn9,btn8,btn7,sum,btn6,btn5,btn4,sub,btn3,btn2,btn1,mul,clr,zero,equal,div;
String displayNum="";
int num1,num2;
int res;
String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result=findViewById(R.id.res);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        clr = findViewById(R.id.clear);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equals);


    }

    @Override
    public void onClick(View view) {
switch (View.getID()){
    case R.id.btn1:
    displayNum+=1;
    result.setText(displayNum);
}
    }
}
