package com.example.iman_tulenaliev_hw_2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private Integer first, second;
    private boolean isOperationClick;
    private Integer result;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("1");
                } else {
                    textview.append("1");
                }
                break;
            case R.id.btn_two:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("2");
                } else {
                    textview.append("2");
                }
                break;
            case R.id.btn_three:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("3");
                } else {
                    textview.append("3");
                }
                break;
            case R.id.btn_four:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("4");
                } else {
                    textview.append("4");
                }
                break;
            case R.id.btn_five:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("5");
                } else {
                    textview.append("5");
                }
                break;
            case R.id.btn_six:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("6");
                } else {
                    textview.append("6");
                }
                break;
            case R.id.btn_seven:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("7");
                } else {
                    textview.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("8");
                } else {
                    textview.append("8");
                }
                break;
            case R.id.btn_nine:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("9");
                } else {
                    textview.append("9");
                }
                break;
            case R.id.btn_zero:
                if (textview.getText().toString().equals("0") || isOperationClick) {
                    textview.setText("0");
                } else {
                    textview.append("0");
                }
                break;
            case R.id.btn_AC:
                first = 0;
                second = 0;
                textview.setText("0");
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textview.getText().toString());
                operation = "plus";
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textview.getText().toString());
                operation = "minus";
                break;
            case R.id.btn_times:
                first = Integer.valueOf(textview.getText().toString());
                operation = "times";
                break;
            case R.id.btn_divided:
                first = Integer.valueOf(textview.getText().toString());
                operation = "divided";
                break;
            case R.id.btn_equal:
                if (operation.equals("plus")) {
                    second = Integer.valueOf(textview.getText().toString());
                    result = first + second;
                    textview.setText(result.toString());
                }
                if (operation.equals("minus")) {
                    second = Integer.valueOf(textview.getText().toString());
                    result = first - second;
                    textview.setText(result.toString());
                }
                if (operation.equals("divided")) {
                    second = Integer.valueOf(textview.getText().toString());
                    if (second == 0 || first == 0) {
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Делить на 0 нельзя!", Toast.LENGTH_SHORT);
                        toast2.show();
                        break;
                    } else {
                        result = first / second;
                        textview.setText(result.toString());
                    }


                }
                if (operation.equals("times")) {
                    second = Integer.valueOf(textview.getText().toString());
                    result = first * second;
                    textview.setText(result.toString());

                }
                break;
        }
        isOperationClick = true;
    }
}