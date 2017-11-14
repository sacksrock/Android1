package com.example.danieliglesia.actividad1android;

import android.view.View;
import android.content.Intent;

/**
 * Created by daniel.iglesia on 14/11/2017.
 */

public class Main2ActivityEvents implements View.OnClickListener {
    Main2Activity main2Activity;

    public Main2ActivityEvents(Main2Activity mainActivity) {
        this.main2Activity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnPerfil) {
            Intent intent = new Intent(main2Activity, MainActivity.class);
            main2Activity.startActivity(intent);
            main2Activity.finish();
        }
        if (view.getId() == R.id.btnSiguiente) {
            if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[0])) {
                main2Activity.titulos.setText(main2Activity.titulos1[1]);
                main2Activity.texto.setText(main2Activity.textos1[1]);
            } else if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[1])) {
                main2Activity.titulos.setText(main2Activity.titulos1[2]);
                main2Activity.texto.setText(main2Activity.textos1[2]);
            } else if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[2])) {
                main2Activity.titulos.setText(main2Activity.titulos1[3]);
                main2Activity.texto.setText(main2Activity.textos1[3]);
            } else if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[3])) {
                main2Activity.titulos.setText(main2Activity.titulos1[0]);
                main2Activity.texto.setText(main2Activity.textos1[0]);
            }
        }
        if (view.getId() == R.id.btnAnterior) {
            if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[0])) {
                main2Activity.titulos.setText(main2Activity.titulos1[3]);
                main2Activity.texto.setText(main2Activity.textos1[3]);
            } else if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[1])) {
                main2Activity.titulos.setText(main2Activity.titulos1[0]);
                main2Activity.texto.setText(main2Activity.textos1[0]);
            } else if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[2])) {
                main2Activity.titulos.setText(main2Activity.titulos1[1]);
                main2Activity.texto.setText(main2Activity.textos1[1]);
            } else if (main2Activity.titulos.getText().toString().equals(main2Activity.titulos1[3])) {
                main2Activity.titulos.setText(main2Activity.titulos1[2]);
                main2Activity.texto.setText(main2Activity.textos1[2]);
            }
        }
    }
}
