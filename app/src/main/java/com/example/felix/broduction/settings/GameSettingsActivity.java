package com.example.felix.broduction.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.felix.broduction.R;
import com.example.felix.broduction.settings.minigames.kings.KingsSettingsActivity;

public class GameSettingsActivity extends AppCompatActivity {

    private Button kingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_settings);


        kingsButton = (Button)findViewById(R.id.kingssettings);
        kingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), KingsSettingsActivity.class));
            }
        });

    }
}