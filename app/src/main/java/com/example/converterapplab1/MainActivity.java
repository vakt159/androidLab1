package com.example.converterapplab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.converterapplab1.fragments.LengthFragment;
import com.example.converterapplab1.fragments.TemperatureFragment;
import com.example.converterapplab1.fragments.WeightFragment;

public class MainActivity extends AppCompatActivity {

    Button length, weight, temperature;
    TextView author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        length = findViewById(R.id.button1);
        weight = findViewById(R.id.button2);
        temperature = findViewById(R.id.button3);
        author = findViewById(R.id.author);
    }

    public void onClick_Temp(View view) {
       // setInvisibility();

        TemperatureFragment tf = new TemperatureFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, tf);
        ft.commit();
    }

    public void onClick_Length(View view) {
       // setInvisibility();
        LengthFragment lf = new LengthFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, lf);
        ft.commit();
    }

    public void onClick_Weight(View view) {
        //setInvisibility();
        WeightFragment wf = new WeightFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, wf);
        ft.commit();
    }

    private void setInvisibility() {
        length.setVisibility(View.INVISIBLE);
        weight.setVisibility(View.INVISIBLE);
        temperature.setVisibility(View.INVISIBLE);
        author.setVisibility(View.INVISIBLE);
    }


}