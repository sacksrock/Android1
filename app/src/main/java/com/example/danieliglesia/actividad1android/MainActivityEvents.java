package com.example.danieliglesia.actividad1android;

import android.util.Log;
import android.view.View;
import android.content.Intent;

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
        else if (view.getId()==R.id.btnSave) {
            dataholder.instance.name = this.mainActivity.name.getText().toString();
            dataholder.instance.mail = this.mainActivity.mail.getText().toString();
            dataholder.instance.direccion = this.mainActivity.direc.getText().toString();
            dataholder.instance.tlfn = this.mainActivity.tlfn.getText().toString();

            mainActivity.name.setEnabled(false);
            mainActivity.mail.setEnabled(false);
            mainActivity.direc.setEnabled(false);
            mainActivity. tlfn.setEnabled(false);
        }
        else if (view.getId()==R.id.btnVolver) {
            Log.v("sdsad", "asda");
            Intent intent = new Intent(mainActivity, Main2Activity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }
    }
    public void setDataholder(DataHolder dataholder){
        this.dataholder=dataholder;
    }
}
