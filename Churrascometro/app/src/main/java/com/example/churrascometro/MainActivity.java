package com.example.churrascometro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar sbMen,sbWomen;
    TextView tvMen, tvWomen, outputSausage, outputMeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sbMen = findViewById(R.id.seekBarWomen);
        sbWomen = findViewById(R.id.seekBarMen);
        tvMen = findViewById(R.id.textViewMen);
        tvWomen = findViewById(R.id.textViewWomen);
        outputSausage = findViewById(R.id.textViewSaudage);
        outputMeat = findViewById(R.id.textViewMeat);

        sbMen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvMen.setText(String.valueOf(i));
                calculate(i, sbMen.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        sbWomen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvWomen.setText(String.valueOf(i));
                calculate(i, sbWomen.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calculate ( int men, int women) {
        double qttSausage, qttMeat;
        qttSausage = men * 250 + women * 150;
        qttMeat = men * 450 + women * 300;
        outputSausage.setText(String.valueOf((qttSausage/1000) + " Kg"));
        outputMeat.setText(String.valueOf((qttMeat/1000) + " Kg"));
    }
}