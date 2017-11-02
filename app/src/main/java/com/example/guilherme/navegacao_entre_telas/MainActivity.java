package com.example.guilherme.navegacao_entre_telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
          /** 1º -> Coloque como atributo da classe o botão que você criou*/
    private Button id_button_segunda_tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


          /** 2º -> Faça o FindViewById do botão*/
        id_button_segunda_tela = (Button) findViewById(R.id.id_button_segunda_tela);

          /** 3º -> Associe esse botão a um evento de OnClick*/

        id_button_segunda_tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  /** 4º -> Instancie a classe Intent.*/

                  /** -> O primeiro parametro é o contexto (isto é, a classe onde você está no momento).
                      -> O segundo parametro é a classe que você quer ir. (no meu caso, eu quero ir pra classe SegundaActivity).*/
                Intent segundaTela = new Intent(MainActivity.this, SegundaActivity.class);

                  /** 5º -> Agora é só "startar" a activity e ao pressionar o botão, você será redirecionado para a segunda tela.*/
                startActivity(segundaTela);

                  /**OPCIONAL* Caso você não queira que o usuário não volte para a tela anterior, coloque essa linha no seu código.*/

                finish();

                /** Com o "finish()" a activity irá ser finalizada, portanto, não será possível voltar a ela.
                 A não ser que você implemente outro botão para voltar.*/
            }
        });


    }
}
