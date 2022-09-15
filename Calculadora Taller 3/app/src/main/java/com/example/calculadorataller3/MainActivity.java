package com.example.calculadorataller3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IOperaciones{

    TextView valor1, valor2, valor3, valor4, valor5, valor6,valor7, valor8,valor9, valor0;
    TextView sum, rest, multi, divi;
    TextView resultado;
    TextView igual, clear;
    float a,b;
    int oper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.txtResultado);
        valor1 = findViewById(R.id.txt1);
        valor2 = findViewById(R.id.txt2);
        valor3 = findViewById(R.id.txt3);
        valor4 = findViewById(R.id.txt4);
        valor5 = findViewById(R.id.txt5);
        valor6 = findViewById(R.id.txt6);
        valor7 = findViewById(R.id.txt7);
        valor8 = findViewById(R.id.txt8);
        valor9 = findViewById(R.id.txt9);
        valor0 = findViewById(R.id.txt0);
        clear = findViewById(R.id.txtClear);


        valor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                    ingreseNumero(resultado.getText().toString() + "1");
            }
        });
        valor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "2");
            }
        });
        valor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "3");
            }
        });
        valor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "4");
            }
        });
        valor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "5");
            }
        });
        valor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "6");
            }
        });
        valor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "7");
            }
        });
        valor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "8");
            }
        });
        valor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "9");
            }
        });
        valor0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( resultado.getText().toString().equalsIgnoreCase("0")){
                    resultado.setText("");
                }
                ingreseNumero(resultado.getText().toString() + "0");
            }
        });

        sum = findViewById(R.id.txtSuma);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(resultado.getText().toString());
                resultado.setText("0");
                oper = 1;
            }
        });

        rest = findViewById(R.id.txtResta);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(resultado.getText().toString());
                resultado.setText("0");
                oper = 2;
            }
        });

        multi = findViewById(R.id.txtMultiplicacion);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(resultado.getText().toString());
                resultado.setText("0");
                oper = 3;
            }
        });
        divi = findViewById(R.id.txtDivision);
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(resultado.getText().toString());
                resultado.setText("0");
                oper = 4;
            }
        });

        igual = findViewById(R.id.txtIgual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (oper){
                    case 1:
                        b = Integer.parseInt(resultado.getText().toString());
                        resultado.setText(""+suma(a,b));
                        break;
                    case 2:
                        b = Integer.parseInt(resultado.getText().toString());
                        resultado.setText(""+resta(a,b));
                        break;
                    case 3:
                        b = Integer.parseInt(resultado.getText().toString());
                        resultado.setText(""+multiplicacion(a,b));
                        break;
                    case 4:
                        b = Integer.parseInt(resultado.getText().toString());
                        resultado.setText(""+division(a,b));
                        break;
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");
            }
        });

    }

    @Override
    public float suma(float a, float b) {
        return (a+b);
    }

    @Override
    public float resta(float a, float b) {
        return (a-b);
    }

    @Override
    public float multiplicacion(float a, float b) {
        return (a*b);
    }

    @Override
    public float division(float a, float b) {
        return (a/b);
    }

    @Override
    public void ingreseNumero(String num) {
        resultado.setText(num);
    }
}