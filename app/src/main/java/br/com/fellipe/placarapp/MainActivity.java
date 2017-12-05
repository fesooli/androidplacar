package br.com.fellipe.placarapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etTimeCasa;
    private EditText etTimeVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.etTimeCasa = (EditText) findViewById(R.id.etTimeCasa);
        this.etTimeVisitante = (EditText) findViewById(R.id.etTimeVisitante);
    }

    public void comecarJogo(View view){
        if(etTimeCasa.getText().toString().isEmpty()){
            Toast.makeText(this, "Informe o time da casa", Toast.LENGTH_SHORT).show();
            return;
        }

        if(etTimeVisitante.getText().toString().isEmpty()){
            Toast.makeText(this, "Informe o time visitante", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("TIMECASA", this.etTimeCasa.getText().toString());
        intent.putExtra("TIMEVISITANTE", this.etTimeVisitante.getText().toString());
        startActivity(intent);
    }
}
