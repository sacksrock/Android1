package com.example.danieliglesia.actividad1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnEdit;
    Button btnVolver;
    Button btnSave;
    EditText name;
    EditText mail;
    EditText direc;
    EditText tlfn;
    private MainActivityEvents Events;
    DataHolder dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Events=new MainActivityEvents(this);
        dataholder=new DataHolder();


        btnEdit=(Button)this.findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(Events);
        btnVolver=(Button)this.findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(Events);
        btnSave=(Button)this.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(Events);
        btnSave.setEnabled(false);
        btnSave.setVisibility(View.INVISIBLE);

        name=(EditText)this.findViewById(R.id.name);
        mail=(EditText)this.findViewById(R.id.mail);
        direc=(EditText)this.findViewById(R.id.tlfn);
        tlfn=(EditText)this.findViewById(R.id.direc);

        name.setEnabled(false);
        mail.setEnabled(false);
        direc.setEnabled(false);
        tlfn.setEnabled(false);

    }
}
