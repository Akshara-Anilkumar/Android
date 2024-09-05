package com.example.login1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;

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
        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);

    }

    public void Login(View view) {
        String UserName = "Akshara";
        String Password = "55";
        String user = String.valueOf(e1.getText());
        String pass = String.valueOf(e2.getText());
        if (user.equals(UserName) && pass.equals(Password)) {
            Toast.makeText(this, "Login Succesfull", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, Afterlogin1.class));
        }

        else {
            Toast.makeText(this, "login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}