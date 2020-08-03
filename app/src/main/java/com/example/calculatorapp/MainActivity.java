package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.addBtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumber = (EditText) findViewById(R.id.firstNum);
                EditText secondNumber = (EditText) findViewById(R.id.secondNum);
                TextView answerTextView = (TextView) findViewById(R.id.answerTxtView);


                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());
                int result = num1 + num2;

                answerTextView.setText(result + "");
            }
        });

        Button subtract = (Button) findViewById(R.id.subtratcBtn);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumber = (EditText) findViewById(R.id.firstNum);
                EditText secondNumber = (EditText) findViewById(R.id.secondNum);
                TextView answerTextView = (TextView) findViewById(R.id.answerTxtView);


                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());
                int result = num1 - num2;

                answerTextView.setText(result + "");
            }
        });

        Button divide = (Button) findViewById(R.id.divideBtn);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumber = (EditText) findViewById(R.id.firstNum);
                EditText secondNumber = (EditText) findViewById(R.id.secondNum);
                TextView answerTextView = (TextView) findViewById(R.id.answerTxtView);


                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());
                int result = num1 / num2;

                answerTextView.setText(result + "");
            }
        });


        Button multiply = (Button) findViewById(R.id.multiplyBtn);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumber = (EditText) findViewById(R.id.firstNum);
                EditText secondNumber = (EditText) findViewById(R.id.secondNum);
                TextView answerTextView = (TextView) findViewById(R.id.answerTxtView);


                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());
                int result = num1 * num2;

                answerTextView.setText(result + "");
            }
        });
    }

}
