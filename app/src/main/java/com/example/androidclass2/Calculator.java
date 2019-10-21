package com.example.androidclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity implements View.OnClickListener{
EditText editText;
Button btn9,btn8,btn7,sum,btn6,btn5,btn4,sub,btn3,btn2,btn1,mul,clr,zero,equal,div;
String displayNum="";
int num1,num2;
int res;
String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText=findViewById(R.id.editText);
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


        zero.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        zero.setOnClickListener(this);
        equal.setOnClickListener(this);
        clr.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
switch (view.getId()){

    case R.id.zero:
        displayNum+=0;
        editText.setText(displayNum);
        break;


    case R.id.btn1:
    displayNum+=1;
        editText.setText(displayNum);
    break;

    case R.id.btn2:
        displayNum+=2;
        editText.setText(displayNum);
        break;

    case R.id.btn3:
        displayNum+=3;
        editText.setText(displayNum);
        break;

    case R.id.btn4:
        displayNum+=4;
        editText.setText(displayNum);
        break;

    case R.id.btn5:
        displayNum+=5;
        editText.setText(displayNum);
        break;

    case R.id.btn6:
        displayNum+=6;
        editText.setText(displayNum);
        break;

    case R.id.btn7:
        displayNum+=7;
        editText.setText(displayNum);
        break;

    case R.id.btn8:
        displayNum+=8;
        editText.setText(displayNum);
        break;

    case R.id.btn9:
        displayNum+=9;
        editText.setText(displayNum);
        break;


    case R.id.sum:
        num1 = Integer.parseInt(displayNum);
        displayNum = "";
        op = "+";
        break;

    case R.id.sub:
        num1 = Integer.parseInt(displayNum);
        displayNum = "";
        op = "-";
        break;

    case R.id.mul:
        num1 = Integer.parseInt(displayNum);
        displayNum = "";
        op = "*";
        break;

    case R.id.div:
        num1 = Integer.parseInt(displayNum);
        displayNum = "";
        op = "/";
        break;

    case R.id.clear:
        displayNum= "";
        editText.setText(displayNum);
        break;

    case R.id.equals:
        num2 = Integer.parseInt(displayNum);
        res = getResult(op,num1,num2);
        editText.setText(String.valueOf(res));
        break;

}

    }

    private int getResult(String op,int n1,int n2){

        switch(op){
            case"+":{
                return n1+n2;
            }

            case"-":{
                return n1-n2;
            }


            case"*":{
                return n1*n2;
            }


            case"/":{
                return n1/n2;
            }
            default:
            {
                return 0;
            }
        }
    }
    }


