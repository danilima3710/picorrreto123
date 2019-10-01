package com.example.daniel.telaprincipal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class CadastrarArtigo extends AppCompatActivity {

    ArrayList<artigo> arrayArtigos= new ArrayList<artigo>();
    artigo objetoArtigo = new artigo();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrarartigo);
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
        final Boolean estagio = (Boolean) findViewById(R.id.estagio).isSelected();
        final Boolean bolsa = (Boolean) findViewById(R.id.bolsa).isSelected();
        final Boolean palestra = (Boolean) findViewById(R.id.palestras).isSelected();
        final Boolean projetoExtensao = (Boolean) findViewById(R.id.projetoExtensao).isSelected();
        final Boolean intervaloCultura = (Boolean) findViewById(R.id.intevaloCultural).isSelected();
        final Boolean evento = (Boolean) findViewById(R.id.evento).isSelected();
        final Boolean noticia = (Boolean) findViewById(R.id.noticia).isSelected();
        final Boolean externo = (Boolean) findViewById(R.id.externo).isSelected();
        final Boolean interno = (Boolean) findViewById(R.id.interno).isSelected();

        if (estagio) {
            objetoArtigo.categoria = " Estágio ";
        }else {
            if (bolsa){
                objetoArtigo.categoria = "Bolsa";
            } else {
                if (palestra) {
                    objetoArtigo.categoria = "Palestra";
                }else{
                    if (projetoExtensao){
                        objetoArtigo.categoria = "Projeto de Extensão";
                    }else
                        if (intervaloCultura){
                            objetoArtigo.categoria = "Intervalo Cultural";
                        }
                }
            }
        }

        if (evento){
            objetoArtigo.tipoArtigo = "Evento";
        }else{
            if (noticia){
                objetoArtigo.tipoArtigo = "Notícia";
            }
        }

        if (interno){
            objetoArtigo.publico = "Interno";
        }else{
            if (externo){
                objetoArtigo.publico = "Externo";
            }
        }

        objetoArtigo.setTitulo(t.getText().toString());
        objetoArtigo.setDescricao(d.getText().toString());

        arrayArtigos.add(objetoArtigo);

        Toast toast = Toast.makeText(getApplicationContext(), Arrays.toString(arrayArtigos.toArray()),Toast.LENGTH_LONG);
        toast.show();

    }
}
