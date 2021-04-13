package com.example.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // inicializamos los componentes
    EditText txt1, txt2;
    Button btnCalcular;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///se traen los valores..
        txt1 = (EditText) findViewById(R.id.numero1);
        txt2 = (EditText) findViewById(R.id.numero2);
        btnCalcular = (Button) findViewById(R.id.button2);
        txtResultado = (TextView) findViewById(R.id.textview2);
        btnCalcular.setOnClickListener(this);
    }

        /// evento en el cual se hara la operacion
        public void onClick(View view){
            // convirtiendo las cadenas a numeros
            int aux = 0;
            int valor1 = Integer.parseInt(txt1.getText().toString());

                int valor2 = Integer.parseInt(txt2.getText().toString());

            int r = valor1 + valor2;
            //Mostrando el resultado
            txtResultado.setText("La suma es: "+r);

        }





}