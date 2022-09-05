package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView image;
    TextView resultShow;
    RadioButton buttonCOS, buttonSIN, buttonTAN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCOS= findViewById(R.id.buttonCOS);
        buttonSIN= findViewById(R.id.buttonSIN);
        buttonTAN= findViewById(R.id.buttonTAN);
        image = findViewById(R.id.imageAngle);
        resultShow = findViewById(R.id.textResult);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onButtonClicked(View v){
        if(v.getId() == R.id.button45){
            image.setImageResource(R.drawable._45);
            ReturnResult(45, v);
        }else if(v.getId() == R.id.button90){
            image.setImageResource(R.drawable._90);
            ReturnResult(90, v);
        }else if(v.getId() == R.id.button180){
            image.setImageResource(R.drawable._180);
            ReturnResult(180, v);
        }

    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void ReturnResult(int grade, View v){
        double result = 0;
        if(buttonCOS.isChecked()){
            result = (Math.cos(grade * Math.PI / 180));
            resultShow.setText("Resultado: " + result + "");
        }else if(buttonSIN.isChecked()){
            result = (Math.sin(grade * Math.PI / 180));
            resultShow.setText("Resultado: " + result + "");
        }else if(buttonTAN.isChecked()){
            result = (Math.tan(grade * Math.PI /180));
            resultShow.setText("Resultado: " + result + "");
        }

    }

}

