package com.example.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText password;


    TextView login1;
    TextView password2;
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

        login = findViewById(R.id.editTextText3);
        password = findViewById(R.id.editTextTextPassword2);
        login1 = findViewById(R.id.textView4);
        password2 = findViewById(R.id.textView6);

        findViewById(R.id.button).setOnClickListener(e -> {
            String loginText = login.getText().toString(); //to pobiera
            String passwordText = password.getText().toString(); // to tez
            login1.setText(login.getText()); // to powinno wysewlwtalc
            password2.setText(password.getText());

        });

    }
}