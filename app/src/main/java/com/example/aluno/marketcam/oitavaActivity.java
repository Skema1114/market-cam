package com.example.aluno.marketcam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import Adapter.ProdutoAdapter;
import Adapter.UsuarioAdapter;
import BD.ProdutoBD;
import BD.UsuarioBD;
import interacao.Produto;
import interacao.Usuario;

public class oitavaActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnUsuariosT8;
    private Button btnProdutosT8;
    private Button btnEnderecosT8;
    private Button btnComprasT8;
    private Button btnListasComprasT8;
    private Button btnCartõesCreditoT8;
    private Toolbar toolbarT8;
    private TextView textProdutosT8;
    private ListView listProdutosT8;

    /*Adapter*/
    private ListView lista;
    private List<Produto> produtoList;
    private ProdutoAdapter produtoAdapter;
    private ProdutoBD produtoBD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oitava);

        /*findViewById*/
        /*findViewById dos Button*/
        btnUsuariosT8 = (Button) findViewById(R.id.btnUsuariosT8);
        btnProdutosT8 = (Button) findViewById(R.id.btnProdutosT8);
        btnEnderecosT8 = (Button) findViewById(R.id.btnEnderecosT8);
        btnComprasT8 = (Button) findViewById(R.id.btnComprasT8);
        btnListasComprasT8 = (Button) findViewById(R.id.btnListasComprasT8);
        btnCartõesCreditoT8 = (Button) findViewById(R.id.btnCartõesCreditoT8);

        /*findViewById do Toolbar*/
        toolbarT8 = (Toolbar) findViewById(R.id.toolbarT8);

        /*findViewById do TextView*/
        textProdutosT8 = (TextView) findViewById(R.id.textProdutosT8);

        /*findViewById do ListView*/
        listProdutosT8 = (ListView) findViewById(R.id.listProdutosT8);


        /*setOnClickListener*/
        /*setOnClickListener dos Button*/
        btnUsuariosT8.setOnClickListener(this);
        btnProdutosT8.setOnClickListener(this);
        btnEnderecosT8.setOnClickListener(this);
        btnComprasT8.setOnClickListener(this);
        btnListasComprasT8.setOnClickListener(this);
        btnCartõesCreditoT8.setOnClickListener(this);

        /*setOnClickListener do ListView*/
        //listProdutosT8.setOnClickListener(this);


        /*Adapter*/
        produtoBD =  new ProdutoBD(this);
        produtoList = produtoBD.ListaProduto();
        produtoAdapter = new ProdutoAdapter(this, produtoList);

        lista = (ListView) findViewById(R.id.listProdutosT8);
        lista.setAdapter(produtoAdapter);
        //lista.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (btnUsuariosT8.isPressed()) {
            Intent intent = new Intent(this, setimaActivity.class);
            startActivity(intent);
            finish();
        }

        if (btnProdutosT8.isPressed()) {
            Intent intent = new Intent(this, oitavaActivity.class);
            startActivity(intent);
            finish();
        }

        if (btnEnderecosT8.isPressed()) {
            Intent intent = new Intent(this, nonaActivity.class);
            startActivity(intent);
            finish();
        }

        if (btnComprasT8.isPressed()) {
            Intent intent = new Intent(this, decimaActivity.class);
            startActivity(intent);
            finish();
        }

        if (btnListasComprasT8.isPressed()) {
            Intent intent = new Intent(this, decimaPrimeiraActivity.class);
            startActivity(intent);
            finish();
        }

        if (btnCartõesCreditoT8.isPressed()) {
            Intent intent = new Intent(this, decimaSegundaActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
