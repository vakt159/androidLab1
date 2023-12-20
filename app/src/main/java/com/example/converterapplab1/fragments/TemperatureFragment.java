package com.example.converterapplab1.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.converterapplab1.R;
import com.example.converterapplab1.converters.TemperatureConverter;

public class TemperatureFragment extends Fragment {

    String[] valueTypes = {"Kelvin", "Celsius", "Fahrenheit"};
    Spinner spinnerFrom, spinnerTo;
    EditText from, to;
    ArrayAdapter<String> adapterItems;

    public static final String SPINNER_FROM = "SPINNER_FROM";
    public static final String SPINNER_TO = "SPINNER_TO";
    public static final String FROM = "FROM";
    public static final String TO = "TO";

    @Override

    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SPINNER_FROM, spinnerFrom.getId());
        outState.putInt(SPINNER_TO, spinnerTo.getId());
        outState.putString(FROM, from.getText().toString());
        outState.putString(TO, to.getText().toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_length, container, false);

        spinnerFrom = view.findViewById(R.id.fromValues);
        spinnerTo = view.findViewById(R.id.toValues);
        from = view.findViewById(R.id.fromInput);
        to = view.findViewById(R.id.toOutput);


        if (savedInstanceState != null) {
            spinnerFrom.setId(savedInstanceState.getInt(SPINNER_FROM));
            spinnerTo.setId(savedInstanceState.getInt(SPINNER_TO));
            from.setText(savedInstanceState.getString(FROM));
            to.setText(savedInstanceState.getString(TO));
        }

        adapterItems = new ArrayAdapter<>(getContext(), com.google.android.material.R.layout.support_simple_spinner_dropdown_item, valueTypes);
        spinnerFrom.setAdapter(adapterItems);
        spinnerTo.setAdapter(adapterItems);

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                update();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                update();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        from.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                update();
            }
        });
        return view;

    }

    private void update() {
        if (!from.getText().toString().equals("") && !spinnerFrom.getSelectedItem().toString().equals("")) {
            String input = from.getText().toString();
            String fromValue = spinnerFrom.getSelectedItem().toString().toUpperCase();
            String toValue = spinnerTo.getSelectedItem().toString().toUpperCase();
            TemperatureConverter temperatureConvertor = new TemperatureConverter();
            to.setText(String.valueOf(temperatureConvertor.convert(Double.parseDouble(input),
                    fromValue,
                    toValue)));
        } else
            to.setText("");
    }

}

