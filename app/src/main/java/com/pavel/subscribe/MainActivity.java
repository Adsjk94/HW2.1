package com.pavel.subscribe;

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

        Init();
        Clear();
    }

    private void Clear() {
        Button boc = findViewById(R.id.buttonClear);

        boc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userName = findViewById(R.id.NameUser);
                EditText userEmail = findViewById(R.id.EmailUser);

                if (v.getId() == R.id.buttonClear);
                userName.setText("");
                userEmail.setText("");
            }
        });
    }

    private void Init() {
        Button bok = findViewById(R.id.buttonOK);

        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = findViewById(R.id.result);
                EditText userName = findViewById(R.id.NameUser);
                EditText userEmail = findViewById(R.id.EmailUser);

                String name = userName.getText().toString();
                String email = userEmail.getText().toString();

                result.setText("Подиска на рассылку успешно оформлена для пользователя " + name + " на электронный адрес " + email);
    }

            });
    }
}