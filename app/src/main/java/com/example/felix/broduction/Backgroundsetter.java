package com.example.felix.broduction;

import android.view.View;
import android.widget.Button;

import com.example.felix.broduction.settings.QuestionsAcitvity;
import com.example.felix.broduction.settings.SettingsActivity;
import com.example.felix.broduction.settings.ThemesActivity;

public class Backgroundsetter {

    public static String themes;

    public static void Backgroundsetter(String theme){
        themes = theme;

        if (themes == "Standard"){
            ThemesActivity.background.setVisibility(View.VISIBLE);
            ThemesActivity.background.setImageResource(R.drawable.bier);

            SettingsActivity.background.setVisibility(View.VISIBLE);
            SettingsActivity.background.setImageResource(R.drawable.bier);

            MainActivity.background.setImageResource(R.drawable.bier);
            MainActivity.background.setVisibility(View.VISIBLE);
        }
        if(themes == "clean"){
            ThemesActivity.background.setVisibility(View.INVISIBLE);
            SettingsActivity.background.setVisibility(View.INVISIBLE);
            MainActivity.background.setVisibility(View.INVISIBLE);
        }

    }

    public static void Backgroundsetternichtvorheraufgerufen(){
        if (themes == "Standard"){
            QuestionsAcitvity.background.setVisibility(View.VISIBLE);
            QuestionsAcitvity.background.setImageResource(R.drawable.bier);
        }
        if(themes == "clean"){
            QuestionsAcitvity.background.setVisibility(View.INVISIBLE);
        }

    }

}