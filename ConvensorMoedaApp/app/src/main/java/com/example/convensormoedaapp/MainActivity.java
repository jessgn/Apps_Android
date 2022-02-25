package com.example.convensormoedaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert (View view) {
        RadioButton deReal = findViewById(R.id.radioButtonDeReal);
        RadioButton deDolar = findViewById(R.id.radioButtonDeDolar);
        RadioButton deEuro = findViewById(R.id.radioButtonDeEuro);
        RadioButton paraReal = findViewById(R.id.radioButtonParaReal);
        RadioButton paraDolar = findViewById(R.id.radioButtonParaDolar);
        RadioButton paraEuro = findViewById(R.id.radioButtonParaEuro);
        EditText input = findViewById(R.id.editTextInput);
        TextView output = findViewById(R.id.textViewOutput);

        double inputMoney = Double.parseDouble(input.getText().toString());
        double outputMoney = 0;

        if (input.length() == 0) {
            Toast.makeText(this, "Digite o valor", Toast.LENGTH_SHORT).show();
        } else if (deReal.isChecked() && paraDolar.isChecked()) {
            outputMoney = inputMoney / 5.12;
        } else if (deReal.isChecked() && paraEuro.isChecked()) {
            outputMoney = inputMoney / 5.74;
        } else if (deDolar.isChecked() && paraReal.isChecked()) {
            outputMoney = inputMoney * 5.12;
        } else if (deDolar.isChecked() && paraEuro.isChecked()) {
            outputMoney = inputMoney / 0.89;
        } else if (deEuro.isChecked() && paraReal.isChecked()) {
            outputMoney = inputMoney * 5.74;
        } else if (deEuro.isChecked() && paraDolar.isChecked()) {
            outputMoney = inputMoney * 1.12;
        }

        output.setText(String.format("R$ %.2f",outputMoney));

        }
}