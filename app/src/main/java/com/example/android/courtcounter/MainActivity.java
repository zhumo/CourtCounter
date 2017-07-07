package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA3Points(View view) {
        teamAPoints += 3;
        redrawTeamA();
    }

    public void teamA2Points(View view) {
        teamAPoints += 2;
        redrawTeamA();
    }

    public void teamAFreeThrow(View view) {
        teamAPoints += 1;
        redrawTeamA();
    }

    public void teamB3Points(View view) {
        teamBPoints += 3;
        redrawTeamB();
    }

    public void teamB2Points(View view) {
        teamBPoints += 2;
        redrawTeamB();
    }

    public void teamBFreeThrow(View view) {
        teamBPoints += 1;
        redrawTeamB();
    }

    private void redrawTeamA() {
        teamAScoreTextView().setText("" + teamAPoints);
    }

    private TextView teamAScoreTextView() {
        return (TextView) findViewById(R.id.team_a_score);
    }

    private void redrawTeamB() {
        teamBScoreTextView().setText("" + teamBPoints);
    }

    private TextView teamBScoreTextView() {
        return (TextView) findViewById(R.id.team_b_score);
    }

}
