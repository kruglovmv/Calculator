package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private static final String TEXT_STATE = "TEXT_STATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        textView = findViewById(R.id.textView);
        instanceState.putCharSequence(TEXT_STATE, textView.getText());
        super.onSaveInstanceState(instanceState);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        textView = findViewById(R.id.textView);
        textView.setText(instanceState.getCharSequence(TEXT_STATE));
        super.onRestoreInstanceState(instanceState);
    }

    private void initView() {
        textView = findViewById(R.id.textView);

        initNonEqualsButton(findViewById(R.id.button_bracket_right));
        initNonEqualsButton(findViewById(R.id.button_bracket_left));
        initNonEqualsButton(findViewById(R.id.button_1));
        initNonEqualsButton(findViewById(R.id.button_2));
        initNonEqualsButton(findViewById(R.id.button_3));
        initNonEqualsButton(findViewById(R.id.button_4));
        initNonEqualsButton(findViewById(R.id.button_5));
        initNonEqualsButton(findViewById(R.id.button_6));
        initNonEqualsButton(findViewById(R.id.button_7));
        initNonEqualsButton(findViewById(R.id.button_8));
        initNonEqualsButton(findViewById(R.id.button_9));
        initNonEqualsButton(findViewById(R.id.button_0));
        initNonEqualsButton(findViewById(R.id.button_plus));
        initNonEqualsButton(findViewById(R.id.button_minus));
        initNonEqualsButton(findViewById(R.id.button_multiplication));
        initNonEqualsButton(findViewById(R.id.button_exponentiation));
        initNonEqualsButton(findViewById(R.id.button_division));
        initNonEqualsButton(findViewById(R.id.button_coma));
        initClearButton(findViewById(R.id.button_clear));
        initEqualsButton(findViewById(R.id.button_equals));
    }

    private void initNonEqualsButton(Button button) {
        button.setOnClickListener(v -> {

            StringBuilder text = new StringBuilder(textView.getText());
            textView.setText(String.format(Locale.getDefault(), "%s", text.append(button.getText())));
        });
    }
    private void initEqualsButton(Button button) {
        button.setOnClickListener(v -> {

            Calculator.calculate(String.valueOf(textView.getText()));
            textView.setText(String.format(Locale.getDefault(), "%s", Calculator.valuesStack.pop()));
        });
    }
    private void initClearButton(Button button) {
        button.setOnClickListener(v -> textView.setText(String.format(Locale.getDefault(), "%s", "")));
    }
}