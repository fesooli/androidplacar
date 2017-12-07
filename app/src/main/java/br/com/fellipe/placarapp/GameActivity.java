package br.com.fellipe.placarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private String timeCasa;
    private String timeVisitante;
    private TextView tvGameTimeCasa;
    private TextView tvGameTimeVisitante;
    private TextView tvPlacarTimeVisitante;
    private TextView tvPlacarTimeCasa;
    private int golCasa;
    private int golVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        if(getIntent() != null){
            timeCasa = getIntent().getStringExtra("TIMECASA");
            timeVisitante = getIntent().getStringExtra("TIMEVISITANTE");
        }
        tvGameTimeCasa = (TextView) findViewById(R.id.tvGameTimeCasa);
        tvGameTimeVisitante = (TextView) findViewById(R.id.tvGameTimeVisitante);
        tvPlacarTimeCasa = (TextView) findViewById(R.id.tvPlacarCasa);
        tvPlacarTimeVisitante = (TextView) findViewById(R.id.tvPlacarVisitante);
        tvGameTimeCasa.setText(timeCasa);
        tvGameTimeVisitante.setText(timeVisitante);

        if(savedInstanceState != null){
            golCasa = savedInstanceState.getInt("GOLCASA");
            golVisitante = savedInstanceState.getInt("GOLVISITANTE");
        }

        tvPlacarTimeCasa.setText(String.valueOf(golCasa));
        tvPlacarTimeVisitante.setText(String.valueOf(golVisitante));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("GOLCASA", golCasa);
        outState.putInt("GOLVISITANTE", golVisitante);
    }

    public void gol(View v) {
        switch(v.getId())
        {
            case R.id.btnCasa :
                tvPlacarTimeCasa.setText(String.valueOf(++golCasa));
                break;
            case R.id.btnVisitante :
                tvPlacarTimeVisitante.setText(String.valueOf(++golVisitante));
                break;
            default :
                break;
        }
    }
}
