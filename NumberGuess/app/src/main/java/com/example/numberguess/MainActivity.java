package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num, tries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r= new Random();
        num = r.nextInt(100) +1;
        System.out.println(num);
        tries= 0;
    }
    public void guess (View view){
        EditText in = findViewById(R.id.editTextInput);
        TextView out = findViewById(R.id.editTextOutput);

        if(in.length() ==0)
            Toast.makeText(this, "Forneça um número!", Toast.LENGTH_SHORT).show();
        else{
            String tip;
            int inputNumber = Integer.parseInt(in.getText().toString());
            tries++;
            if(num > inputNumber)
                tip = "Número sorteado é maior!";
            else if (num < inputNumber)
                tip= "Número sorteado é menor!";
            else
                tip="Acertou! \nVocê usou " + tries + " tentativas.";
            out.setText(tip);
        }
    }
}