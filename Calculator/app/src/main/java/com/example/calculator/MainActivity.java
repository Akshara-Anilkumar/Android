package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        TV=(TextView) findViewById(R.id.textView4);

    }

    public void Add(View view) {

            double num1 =Double.parseDouble(e1.getText().toString());
            double num2 =Double.parseDouble(e2.getText().toString());
            double ans=num1+num2;
            TV.setText(""+ans);

        }

    public void Sub(View view) {
        double num1 =Double.parseDouble(e1.getText().toString());
        double num2 =Double.parseDouble(e2.getText().toString());
        double ans=num1-num2;
        TV.setText(""+ans);
    }

    public void mul(View view) {
        double num1 =Double.parseDouble(e1.getText().toString());
        double num2 =Double.parseDouble(e2.getText().toString());
        double ans=num1*num2;
        TV.setText(""+ans);
    }

    public void div(View view) {
        double num1 =Double.parseDouble(e1.getText().toString());
        double num2 =Double.parseDouble(e2.getText().toString());
        double ans=num1/num2;
        TV.setText(""+ans);
    }
}