package com.example.felix.broduction.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.felix.broduction.Backgroundsetter;
import com.example.felix.broduction.R;

public class ThemesActivity extends AppCompatActivity {


    public static Button  themestandartButton;
    public static Button  themecleanButton;
    public static ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);

        background = (ImageView) findViewById(R.id.background);
        themestandartButton = (Button)findViewById(R.id.themestandardButton);
        themestandartButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Backgroundsetter.Backgroundsetter("Standard");
            }
        });

        themecleanButton = (Button)findViewById(R.id.themecleanButton);
        themecleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Backgroundsetter.Backgroundsetter("clean");
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        Backgroundsetter.Backgroundsetter(Backgroundsetter.themes);
    }
}
