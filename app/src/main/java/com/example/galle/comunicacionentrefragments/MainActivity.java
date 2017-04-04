package com.example.galle.comunicacionentrefragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int REQUEST_CODE = 1;

    EditText textoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoEnviar = (EditText)findViewById(R.id.texto);
    }

    public void comunicarActivity(View v){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("texto", textoEnviar.getText().toString());
        startActivityForResult(i, REQUEST_CODE);
    }

}
