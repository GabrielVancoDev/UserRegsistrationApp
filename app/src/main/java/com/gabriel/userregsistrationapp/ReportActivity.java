package com.gabriel.userregsistrationapp;

// Importações de Componentes de UI, intenções e a biblioteca
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {

    private TextView textViewReport;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // Define o Layout XML dessa tela de relatório
        setContentView(R.layout.activity_report);
        // mapeamento do TextView do XML para o Java
        textViewReport =  findViewById(R.id.textViewReport);
        // Encontra o Botão e define o clique para enviar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        // O Botão de Retorno Utilizando expressao lamdda
        btnVoltar.setOnClickListener(v-> voltarParaCadastro());

        /* Conexão com o banco de dados
        1- Cria uma instância do banco "user-database"]
        2-.allowMainThreadQueries(): Serve para liberar operações de consulta feitas em threads da UI.
        Por padrão, ROOM proíbe isso. O correto seria fazer consultas em threads separadas
         */

    }


    // Método Responsável pela Navegação entre as telas do app
    public void voltarParaCadastro(){
        // Intenção para abrir a tela de cadasstro
        Intent intent = new Intent(ReportActivity.this, MainActivity.class);
        startActivity(intent);
        // Fecha a tela de relatório para não acumular uma pilha de tarefas
        finish();
    }
}
