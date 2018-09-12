package com.example.felix.broduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.felix.broduction.settings.SettingsActivity;
import com.example.felix.broduction.quests.*;

public class MainActivity extends AppCompatActivity {


    private static ImageButton settingsButton;
    private static QuestManager qManager = new QuestManager();


    public MainActivity() {
        qManager.Init();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settingsButton = (ImageButton)findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });


    }



    public static QuestManager getqManage() {
        return qManager;
    }
}
