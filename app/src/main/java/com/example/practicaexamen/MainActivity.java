package com.example.practicaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsuario, txtPasswd;
    private Button BotonInicio, BotonRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPasswd = (EditText) findViewById(R.id.txtPasswd);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);

        BotonInicio = (Button) findViewById(R.id.BotonInicio);
        BotonRegistro = (Button) findViewById(R.id.BotonRegistro);
    }
    public void entrar(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}