package com.example.danieliglesia.actividad1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private Main2ActivityEvents Events;
    Button btnPerfil;
    Button btnAnterior;
    Button btnSiguiente;
    EditText titulos;
    EditText texto;
    public String[] titulos1;
    public String[] textos1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Events = new Main2ActivityEvents(this);
        btnPerfil=(Button)this.findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(Events);

        btnAnterior = (Button) this.findViewById(R.id.btnAnterior);
        btnAnterior.setOnClickListener(Events);
        btnSiguiente = (Button) this.findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(Events);

        titulos = (EditText)this.findViewById(R.id.tituloTxt);
        texto = (EditText)this.findViewById(R.id.textoTxt);
        titulos1 = this.getResources().getStringArray(R.array.titulos);
        textos1 = this.getResources().getStringArray(R.array.textos);
        titulos.setText(titulos1[0]);
        texto.setText(textos1[0]);

    }
}
