package com.dam.tema1_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    NumerosPrimos numerosPrimos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBoton = (Button)findViewById(R.id.button);
        numerosPrimos = new NumerosPrimos();
        miBoton.setOnClickListener(this);
    }

    public void onClick(View view) {

        EditText numeroACalcularEditText=(EditText)findViewById(R.id.numeroACalcular);
        Integer numeroACalcular = Integer.parseInt(numeroACalcularEditText.getText().toString());

        Integer numeroPrimo= numerosPrimos.calcularNumeroPrimo(numeroACalcular);

        TextView miTexto = (TextView)findViewById(R.id.resultado);
        miTexto.setText(Integer.toString(numeroPrimo));
    }
}
