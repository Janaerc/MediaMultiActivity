package com.example.mediamultiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nomeEditText;
    private EditText nota1EditText;
    private EditText nota2EditText;
    private EditText frequenciaEditText;
    private String resultado;
    private double media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = findViewById(R.id.editTextNome);
        nota1EditText = findViewById(R.id.editTextNota1);
        nota2EditText = findViewById(R.id.editTextNota2);
        frequenciaEditText = findViewById(R.id.editTextFrequencia);
    }

    public void onClick(View view){
        Intent it = new Intent(this, MediaFinal.class);

        media = (Double.parseDouble(nota1EditText.getText().toString()) + Double.parseDouble(nota2EditText.getText().toString()))/2;

        Bundle params = new Bundle();
        params.putString("msg",resultado);
        params.putString("media",String.valueOf(media));
        it.putExtras(params);
        startActivity(it);
    }



}