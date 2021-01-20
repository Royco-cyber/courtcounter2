package com.example.courtcounter1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView OutputscoreA, OutputscoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        OutputscoreA = (TextView) findViewById(R.id.outputscoreA);
        OutputscoreB = (TextView) findViewById(R.id.outputscoreB);

        Intent tampilkanIntent =getIntent();
        Bundle bukaPaket = tampilkanIntent.getExtras();

        String scoreA = bukaPaket.getString("TeamAscore");
        String scoreB = bukaPaket.getString("TeamBscore");

        OutputscoreA.setText("TeamAscore");
        OutputscoreB.setText("TeamBscore");
    }
}