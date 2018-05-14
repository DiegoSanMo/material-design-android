package com.example.diegomoreno.calculatormd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btUno, btDos, btTres, btCuatro, btCinco, btSeis, btSiete, btOcho, btNueve, btCero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCero = (Button)findViewById(R.id.btCero);
        btUno = (Button)findViewById(R.id.btUno);
        btDos = (Button)findViewById(R.id.btDos);
        btTres = (Button)findViewById(R.id.btTres);
        btCuatro = (Button)findViewById(R.id.btCuatro);
        btCinco = (Button)findViewById(R.id.btCinco);
        btSeis = (Button)findViewById(R.id.btSeis);
        btSiete = (Button)findViewById(R.id.btSiete);
        btOcho = (Button)findViewById(R.id.btOcho);
        btNueve = (Button)findViewById(R.id.btNueve);
    }
}
