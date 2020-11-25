package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button buttonChance;
    private TextView textView;
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUi();
    }

    public void setupUi() {
        buttonChance = findViewById(R.id.btn);
        textView = findViewById(R.id.textView1);
        login = findViewById(R.id.textView2);
        password = findViewById(R.id.textView3);

        buttonChance.setOnClickListener(v -> {
            String message1 = login.getText().toString().trim();
            String message2 = password.getText().toString().trim();
            if (message1.equals("Temirlan") && (message2.equals("230896"))){
                Toast.makeText(this, "Успешно", Toast.LENGTH_SHORT).show();
            } else if (message1.equals("") && (message2.equals(""))){
                Toast.makeText(this,"Вы ввели неправильные данные", Toast.LENGTH_SHORT).show();
            }
            if (message2.length() > 6){
                Toast.makeText(this, "Вы ввели неправильный пароль", Toast.LENGTH_SHORT).show();
            }
        });
    }
}



