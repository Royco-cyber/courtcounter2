package com.example.courtcounter1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText teamAscore;
    EditText teamBscore;
    Button Btn_hasil;
    int TeamAscore=0;
    int TeamBscore=0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAscore = (EditText) findViewById(R.id.TeamAValue);
        teamBscore = (EditText) findViewById(R.id.TeamBValue);
        Btn_hasil = (Button) findViewById(R.id.btn_hasil);


        Btn_hasil.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                String TeamAscore = teamAscore.getText().toString();
                String TeamBscore = teamBscore.getText().toString();
                Intent myIntent = new Intent(MainActivity.this, hasil.class);
                Bundle paket = new Bundle();
                paket.putString("TeamAscore",TeamAscore);
                paket.putString("TeamBscore",TeamBscore);
                myIntent.putExtras(paket);
                startActivity(myIntent);
            }
        });
    }

    public void threepointTeamA(View view) {
        TeamAscore=TeamAscore+3;
        display(TeamAscore);
    }

    public void twopointTeamA(View view) {
        TeamAscore=TeamAscore+2;
        display(TeamAscore);
    }

    public void onepointTeamA(View view) {
        TeamAscore=TeamAscore+1;
        display(TeamAscore);
    }

    private void display(int teamAscore) {
        TextView TeamAValue= (TextView) findViewById(R.id.TeamAValue);
        TeamAValue.setText(""+teamAscore);
    }

    public void threepointTeamB(View view) {
        TeamBscore=TeamBscore+3;
        displayB(TeamBscore);
    }

    public void twopointTeamB(View view) {
        TeamBscore=TeamBscore+2;
        displayB(TeamBscore);
    }

    public void onepointTeamB(View view) {
        TeamBscore=TeamBscore+1;
        displayB(TeamBscore);
    }

    private void displayB(int teamBscore) {
        TextView TeamBValue= (TextView) findViewById(R.id.TeamBValue);
        TeamBValue.setText(""+teamBscore);
    }


    public void reset(View view) {
        TeamAscore=0;
        TeamBscore=0;
        display(TeamAscore);
        displayB(TeamBscore);
    }




}