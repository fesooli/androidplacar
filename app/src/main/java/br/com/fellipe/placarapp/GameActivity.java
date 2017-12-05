package br.com.fellipe.placarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private String timeCasa;
    private String timeVisitante;
    private TextView tvGameTimeCasa;
    private TextView tvGameTimeVisitante;
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
        tvGameTimeCasa.setText(timeCasa);
        tvGameTimeVisitante.setText(timeVisitante);
    }
}
