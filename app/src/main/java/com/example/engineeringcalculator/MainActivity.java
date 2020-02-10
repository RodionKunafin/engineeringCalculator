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
            resultField.setText("0");
        }
        if (id == R.id.btn1) {
            resultField.setText("1");
        }
        if (id == R.id.btn2) {
            resultField.setText("2");
        }
        if (id==R.id.btn3){
            resultField.setText("3");
        }
        if (id==R.id.btn4){
            resultField.setText("4");
        }
        if (id==R.id.btn5){
            resultField.setText("5");
        }
        if (id==R.id.btn6){
            resultField.setText("6");
        }
        if (id==R.id.btn7){
            resultField.setText("7");
        }
        if (id==R.id.btn8){
            resultField.setText("8");
        }
        if (id==R.id.btn9){
            resultField.setText("9");
        }
    }
    public void dotPress(View v){
        int id = v.getId();
        if (id==R.id.btnPoint){
            resultField.setText(".");
        }
    }

    private void initViews() {
        resultField  = findViewById(R.id.resultField);
        btnPoint = findViewById(R.id.btnPoint);
        changeOfView = findViewById(R.id.changeOfView);
        returnAll = findViewById(R.id.returnAll);

        changeOfView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.btnSin).setVisibility(View.GONE);
                findViewById(R.id.btnCos).setVisibility(View.GONE);
                findViewById(R.id.btnTan).setVisibility(View.GONE);
                findViewById(R.id.btnLg).setVisibility(View.GONE);
                findViewById(R.id.btnLn).setVisibility(View.GONE);
                findViewById(R.id.deg).setVisibility(View.GONE);
                findViewById(R.id.e).setVisibility(View.GONE);
                findViewById(R.id.closingBracket).setVisibility(View.GONE);
                findViewById(R.id.openingBracket).setVisibility(View.GONE);

            }
        });
        returnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.btnSin).setVisibility(View.VISIBLE);
                findViewById(R.id.btnCos).setVisibility(View.VISIBLE);
                findViewById(R.id.btnTan).setVisibility(View.VISIBLE);
                findViewById(R.id.btnLg).setVisibility(View.VISIBLE);
                findViewById(R.id.btnLn).setVisibility(View.VISIBLE);
                findViewById(R.id.deg).setVisibility(View.VISIBLE);
                findViewById(R.id.e).setVisibility(View.VISIBLE);
                findViewById(R.id.closingBracket).setVisibility(View.VISIBLE);
                findViewById(R.id.openingBracket).setVisibility(View.VISIBLE);
            }
        });

    }

}




