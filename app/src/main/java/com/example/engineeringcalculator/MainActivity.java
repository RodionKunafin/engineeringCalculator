package com.example.engineeringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultField;
    private Button btnPoint;
    Button changeOfView;
    Button returnAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void numPress(View view) {
        int id = view.getId();
        if (id == R.id.btn0) {
            resultField.setText(resultField.getText().toString() + "0");
        }
        if (id == R.id.btn1) {
            resultField.setText(resultField.getText().toString() + "1");
        }
        if (id == R.id.btn2) {
            resultField.setText(resultField.getText().toString() + "2");
        }
        if (id == R.id.btn3) {
            resultField.setText(resultField.getText().toString() + "3");
        }
        if (id == R.id.btn4) {
            resultField.setText(resultField.getText().toString() + "4");
        }
        if (id == R.id.btn5) {
            resultField.setText(resultField.getText().toString() + "5");
        }
        if (id == R.id.btn6) {
            resultField.setText(resultField.getText().toString() + "6");
        }
        if (id == R.id.btn7) {
            resultField.setText(resultField.getText().toString() + "7");
        }
        if (id == R.id.btn8) {
            resultField.setText(resultField.getText().toString() + "8");
        }
        if (id == R.id.btn9) {
            resultField.setText(resultField.getText().toString() + "9");
        }
    }
    public void dotPress(View v){
        int id = v.getId();
        if (id==R.id.btnPoint){
            resultField.setText(resultField.getText().toString() + ".");
        }
    }

    private void initViews() {
        resultField  = findViewById(R.id.resultField);
        btnPoint = findViewById(R.id.btnPoint);
        changeOfView = findViewById(R.id.changeOfView);

        changeOfView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.L1).setVisibility(View.VISIBLE);
                findViewById(R.id.L2).setVisibility(View.GONE);
            }
        });

    }

}




