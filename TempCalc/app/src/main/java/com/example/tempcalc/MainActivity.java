package com.example.tempcalc;

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

    public void convert(View view){
        RadioButton toCelsius= findViewById(R.id.radioButtonParaCelsius);
        EditText input= findViewById(R.id.editTextInput);
        TextView output= findViewById(R.id.textViewOutput);

        if(input.length() == 0)
            Toast.makeText(this, "Forneça a temperatura", Toast.LENGTH_SHORT).show();
            else{
                double tempInput = Double.parseDouble(input.getText().toString());
                double tempOutput = 0;
                if(toCelsius.isChecked()){
                    tempOutput = (tempInput - 32) * 5 / 9;
                    output.setText("Resultado: " + String.valueOf(tempOutput) + " C");
                }
                else{
                    tempOutput = (tempInput * 9) / 5 + 32;
                    output.setText("Resultado: " + String.valueOf(tempOutput) + " F");
                }
        }
    }
}
