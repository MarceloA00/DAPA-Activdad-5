package com.example.dapaactividad5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Switch switch1, switch2, switch3, switch4, switch5;
    private Button btnShowText;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);
        switch4 = findViewById(R.id.switch4);
        switch5 = findViewById(R.id.switch5);

        btnShowText = findViewById(R.id.verify);
        textViewResult = findViewById(R.id.textViewResult);

        btnShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarTextoSwitches();
            }
        });
    }

    private void mostrarTextoSwitches() {
        StringBuilder texto = new StringBuilder();

        if (switch1.isChecked()) {
            texto.append(switch1.getText()).append("\n");
        }
        if (switch2.isChecked()) {
            texto.append(switch2.getText()).append("\n");
        }
        if (switch3.isChecked()) {
            texto.append(switch3.getText()).append("\n");
        }
        if (switch4.isChecked()) {
            texto.append(switch4.getText()).append("\n");
        }
        if (switch5.isChecked()) {
            texto.append(switch5.getText()).append("\n");
        }

        textViewResult.setText(texto.toString().trim());
    }
}