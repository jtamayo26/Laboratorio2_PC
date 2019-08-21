package com.example.laboratorio2_pc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    //declarar variable
    private EditText Caja;
    private TextView Salida;
    private Button botonmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Caja = (EditText)findViewById(R.id.txtPalabra);
        Salida = (TextView)findViewById(R.id.txtsalida);
        botonmostrar = (Button)findViewById(R.id.btnPalabra);

        botonmostrar.setOnClickListener(new View.OnClickListener() {
            int contador = 0;
            @Override
            public void onClick(View view) {
                int contador = 0;

                String lapalabra = null;

                lapalabra = Caja.getText().toString();
                Salida.setText(lapalabra);

                for (int x=0;x<lapalabra.length();x++){
                    if ((String.valueOf(lapalabra.charAt(x)).equals("a"))){
                        contador++;
                    }
                }

            }
        });


    }
}
