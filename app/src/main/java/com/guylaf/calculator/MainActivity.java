package com.guylaf.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String inter = " ";
    Calculator calcul = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("0");

        final Button t0 = (Button) findViewById(R.id.t0);
        t0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("0");
            }
        });

        final Button t1 = (Button) findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("1");
            }
        });

        final Button t2 = (Button) findViewById(R.id.t2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("2");
            }
        });

        final Button t3 = (Button) findViewById(R.id.t3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("3");
            }
        });

        final Button t4 = (Button) findViewById(R.id.t4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("4");
            }
        });

        final Button t5 = (Button) findViewById(R.id.t5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("5");
            }
        });

        final Button t6 = (Button) findViewById(R.id.t6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("6");
            }
        });

        final Button t7 = (Button) findViewById(R.id.t7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("7");
            }
        });
        final Button t8 = (Button) findViewById(R.id.t8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("8");
                textView.setText("0");
            }
        });
        final Button t9 = (Button) findViewById(R.id.t9);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("9");
            }
        });

        final Button buttonCancel = (Button) findViewById(R.id.button_cancel);
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });

        final Button tcomma = (Button) findViewById(R.id.t_comma);
        tcomma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                if (!text.contains(",")) {
                    textView.setText(text + ",");
                }
            }
        });

        final Button tequal = (Button) findViewById(R.id.t_equal);
        tequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(inter);
            }
        });

        final Button tdiv = (Button) findViewById(R.id.t_div);
        tdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.valueOf(textView.getText().toString());
                inter = String.valueOf(calcul.div(value,"/"));
            }
        });
        final Button tmul = (Button) findViewById(R.id.t_mul);
        tmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.valueOf(textView.getText().toString());
                inter = String.valueOf(calcul.mult(value,"X"));
            }
        });
        final Button tsub = (Button) findViewById(R.id.t_sub);
        tsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.valueOf(textView.getText().toString());
                inter = String.valueOf(calcul.sub(value,"-"));
            }
        });
        final Button tadd = (Button) findViewById(R.id.t_add);
        tadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.valueOf(textView.getText().toString());
                inter = String.valueOf(calcul.add(value,"+"));
            }
        });
    }

    public void setText(String text) {
        final TextView textView = (TextView) findViewById(R.id.text_view);
        String saveText = textView.getText().toString();
        if (saveText.equals("0")) {
            textView.setText(text);
        } else {
            textView.setText(saveText + text);
        }

    }
}

