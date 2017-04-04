package com.example.galle.comunicacionentrefragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String texto;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i = getIntent();
        Bundle extras = i.getExtras();
        texto = extras.getString("texto");
        View fragment = findViewById(R.id.fragment_confirmacion);
        TextView confirmacion_txt = (TextView) fragment.findViewById(R.id.confirmacion);
        confirmacion_txt.setText("Has escrito " + texto);
    }
}
