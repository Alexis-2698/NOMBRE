package com.example.autonoma.ejerciciocalcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraMainActivity extends AppCompatActivity {
    EditText etNumero1,etNumero2;
    Button btnRestar,btnSumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_main);

        etNumero1 = (EditText)findViewById(R.id.etNumero1);
        etNumero2 = (EditText)findViewById(R.id.etNumero2);

        btnRestar = findViewById(R.id.btnRestar);
        btnSumar = findViewById(R.id.btnSumar);
        final TextView tvResultado = (TextView) findViewById(R.id.textViewResultado);
    
            btnRestar.setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux1 = Integer.valueOf(etNumero1.getText().toString());
                int aux2 = Integer.valueOf(etNumero2.getText().toString());
                int resultado = aux1 - aux2;
                tvResultado.setText(""+resultado);

            }

        });
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux1 = Integer.valueOf(etNumero1.getText().toString());
                int aux2 = Integer.valueOf(etNumero2.getText().toString());
                int resultado = aux1 + aux2;
                tvResultado.setText(""+resultado);
            }

        });
    }
}
