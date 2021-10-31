package com.example.pd_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void about(View view){

        Toast.makeText(this, "More functions is Coming Soon ! ", Toast.LENGTH_SHORT).show();
    }

    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button Plus,Minus,Multiply,Devide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue= findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        Plus = findViewById(R.id.btnPlus);
        Minus = findViewById(R.id.btnMinus);
        Multiply = findViewById(R.id.btnMulti);
        Devide = findViewById(R.id.btnDevide);

        Plus.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {

                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue+secondValue;
                tvAns.setText("Your ans is = " + ans);



            }
        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue-secondValue;
                tvAns.setText("Your ans is = " + ans);



            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue*secondValue;
                tvAns.setText("Your ans is = " + ans);



            }
        });
        Devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue/secondValue;
                tvAns.setText("Your ans is = " + ans);



            }
        });


    }
}