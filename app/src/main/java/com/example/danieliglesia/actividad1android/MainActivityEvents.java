package com.example.danieliglesia.actividad1android;

import android.view.View;

/**
 * Created by daniel.iglesia on 13/11/2017.
 */

public class MainActivityEvents implements View.OnClickListener{
    private MainActivity mainActivity;
    private DataHolder dataholder;

    public MainActivityEvents(MainActivity mainActivity){this.mainActivity=mainActivity;}

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.btnEdit){
        this.mainActivity.name.setEnabled(true);
        this.mainActivity.mail.setEnabled(true);
        this.mainActivity.direc.setEnabled(true);
        this.mainActivity.tlfn.setEnabled(true);
        this.mainActivity.btnSave.setEnabled(true);
        this.mainActivity.btnEdit.setVisibility(View.INVISIBLE);
        this.mainActivity.btnSave.setVisibility(View.VISIBLE);
        }
        else if (view.getId()==R.id.btnSave){
          dataholder.setName(this.mainActivity.name.getText().toString());
          dataholder.setMail(this.mainActivity.mail.getText().toString());
          dataholder.setDireccion(this.mainActivity.direc.getText().toString());
          dataholder.setTlfn(this.mainActivity.tlfn.getText().toString());

          this.mainActivity.name.setText(dataholder.name);
          this.mainActivity.mail.setText(dataholder.mail);
          this.mainActivity.direc.setText(dataholder.direccion);
        }
    }
}
