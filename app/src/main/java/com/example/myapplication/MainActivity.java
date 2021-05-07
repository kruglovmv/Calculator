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

        initButton1Listener();
        initButton2Listener();
        initButton3Listener();
        initButton4Listener();
        initButton5Listener();
        initButton6Listener();
        initButton7Listener();
        initButton8Listener();
        initButton9Listener();
        initButton0Listener();
        initButton10Listener();
        initButton11Listener();
        initButtonClearListener();
        initButtonPlusListener();
        initButtonComaListener();
        initButtonDivisionListener();
        initButtonMinusListener();
        initButtonMultiplicationListener();
        initButtonExponentiationListener();
        initButtonEqualsListener();
    }

    private void initButton1Listener() {
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("1")));
            }
        });
    }

    private void initButton2Listener() {
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("2")));
            }
        });
    }

    private void initButton3Listener() {
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("3")));
            }
        });
    }

    private void initButton4Listener() {
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("4")));
            }
        });
    }

    private void initButton5Listener() {
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("5")));
            }
        });
    }

    private void initButton6Listener() {
        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("6")));
            }
        });
    }

    private void initButton7Listener() {
        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("7")));
            }
        });
    }

    private void initButton8Listener() {
        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("8")));
            }
        });
    }

    private void initButton9Listener() {
        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("9")));
            }
        });
    }

    private void initButton0Listener() {
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("0")));
            }
        });
    }

    private void initButtonComaListener() {
        Button buttonComa = findViewById(R.id.button_coma);
        buttonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append(".")));
            }
        });
    }

    private void initButtonClearListener() {
        Button buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(String.format(Locale.getDefault(), "%s", ""));
            }
        });
    }

    private void initButtonPlusListener() {
        Button buttonPlus = findViewById(R.id.button_plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("+")));
            }
        });
    }

    private void initButtonMinusListener() {
        Button buttonMinus = findViewById(R.id.button_minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("-")));
            }
        });
    }

    private void initButtonMultiplicationListener() {
        Button buttonMultiplication = findViewById(R.id.button_multiplication);
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("*")));
            }
        });
    }

    private void initButtonDivisionListener() {
        Button buttonDivision = findViewById(R.id.button_division);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("/")));
            }
        });
    }

    private void initButtonExponentiationListener() {
        Button buttonExponentiation = findViewById(R.id.button_exponentiation);
        buttonExponentiation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("^")));
            }
        });
    }

    private void initButtonEqualsListener() {
        Button buttonEquals = findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) textView.getText();
                Calculator.calculate(text);
                textView.setText(String.format(Locale.getDefault(), "%s", Calculator.valuesStack.pop()));
            }
        });
    }

    private void initButton10Listener() {
        Button button10 = findViewById(R.id.button_10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append("(")));
            }
        });
    }

    private void initButton11Listener() {
        Button button11 = findViewById(R.id.button_11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder text = new StringBuilder(textView.getText());
                textView.setText(String.format(Locale.getDefault(), "%s", text.append(")")));
            }
        });
    }
}