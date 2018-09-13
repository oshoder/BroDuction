package com.example.felix.broduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.felix.broduction.settings.SettingsActivity;
import com.example.felix.broduction.quests.*;

public class MainActivity extends AppCompatActivity {


    private static ImageButton settingsButton;
    private static QuestManager qManager = new QuestManager();
    public static ImageView background;


    public MainActivity() {
        qManager.Init();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (ImageView) findViewById(R.id.background);

        settingsButton = (ImageButton)findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });


    }
    @Override
    protected void onResume() {
        super.onResume();
        Backgroundsetter.Backgroundsetter(Backgroundsetter.themes);
    }

    public static QuestManager getqManage() {
        return qManager;
    }
}
