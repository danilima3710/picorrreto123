package com.example.daniel.telaprincipal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class CadastrarArtigo extends AppCompatActivity {

    ArrayList<artigo> arrayArtigos= new ArrayList<artigo>();
    artigo objetoArtigo = new artigo();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_artigo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void cadastrar(View view) {

        final EditText t = (EditText) findViewById(R.id.titulo);
        final EditText d = (EditText) findViewById(R.id.descricao);


        objetoArtigo.setTitulo(t.getText().toString());
        objetoArtigo.setDescricao(d.getText().toString());
    }
}
