package com.example.felix.broduction.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.felix.broduction.R;

public class SettingsActivity extends AppCompatActivity {



    private SeekBar difficultControl;
    private TextView diffView;
    private int difficult = 1;
    private Button questionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        difficultControl = (SeekBar)findViewById(R.id.difficultControl);
        diffView = (TextView)findViewById(R.id.diffView);
        questionsButton = (Button)findViewById(R.id.confQuetsButton);

        questionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QuestionsAcitvity.class));
            }
        });


        difficultControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                difficult = difficultControl.getProgress();
                diffView.setText("Schwierigkeit: " + difficult);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Useless
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Useless
            }
        });
    }
}
