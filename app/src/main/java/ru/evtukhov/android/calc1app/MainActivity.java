package ru.evtukhov.android.calc1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView out;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        out = findViewById(R.id.text);
        btn0 = findViewById(R.id.num0);
        btn1 = findViewById(R.id.num1);
        btn2 = findViewById(R.id.num2);
        btn3 = findViewById(R.id.num3);
        btn4 = findViewById(R.id.num4);
        btn5 = findViewById(R.id.num5);
        btn6 = findViewById(R.id.num6);
        btn7 = findViewById(R.id.num7);
        btn8 = findViewById(R.id.num8);
        btn9 = findViewById(R.id.num9);
        dot = findViewById(R.id.dot);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notDoubleNull = out.getText().toString();
                if (notDoubleNull.contains(getString(R.string.app_dot))) {
                    out.setText(out.getText().toString() + getString(R.string.app_num0));
                }
                else {
                    if (notDoubleNull.startsWith(getString(R.string.app_num0))) {
                        out.setText(out.getText().toString() + getString(R.string.app_dot));
                    }
                    else {
                        out.setText(out.getText().toString() + getString(R.string.app_num0));
                    }
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num1));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num2));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num3));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num4));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num5));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num6));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num7));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num8));
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString() + getString(R.string.app_num9));
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notDoubleDot = out.getText().toString();
                if (notDoubleDot.contains(getString(R.string.app_dot))) {
                    v.setClickable(false);
                }
                else {
                    out.setText(out.getText().toString() + getString(R.string.app_dot));
                }
            }
        });
    }
}
