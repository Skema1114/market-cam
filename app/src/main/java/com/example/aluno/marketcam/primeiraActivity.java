package com.example.aluno.marketcam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class primeiraActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnJCadastroT1;
    private Button btnNCadastroT1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        /*findViewById dos Button*/
         btnJCadastroT1 = (Button) findViewById(R.id.btnJCadastroT1);
         btnNCadastroT1 = (Button) findViewById(R.id.btnNCadastroT1);

        /*setOnClickListener dos Button*/
         btnJCadastroT1.setOnClickListener(this);
         btnNCadastroT1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
