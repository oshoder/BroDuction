package com.example.felix.broduction.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.felix.broduction.Backgroundsetter;
import com.example.felix.broduction.MainActivity;
import com.example.felix.broduction.R;
import com.example.felix.broduction.quests.Quest;
import com.example.felix.broduction.quests.QuestManager;

public class QuestionsAcitvity extends AppCompatActivity {


    private QuestManager questManager;
    private TextView classicsLabel;
    private ScrollView leftScrollView;
    public static ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_acitvity);

        background = (ImageView) findViewById(R.id.background);
        Backgroundsetter.BackgroundsetQuestion();

        questManager = MainActivity.getqManage();
        leftScrollView = (ScrollView)findViewById(R.id.leftScrollView);
        classicsLabel = (TextView)findViewById(R.id.classicsLabel);
        classicsLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowQuest(Quest.QuestTypes.Classic);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Backgroundsetter.BackgroundsetQuestion();
    }


    private void ShowQuest(Quest.QuestTypes type) {
        for (Quest quest : questManager.Quests()) {
            if(quest.getType() == Quest.QuestTypes.Classic) {
                CheckBox checkBox = new CheckBox(this);
                checkBox.setChecked(true);
                checkBox.setText(quest.getContext());
                leftScrollView.addView(checkBox);
            }
            else if(quest.getType() == Quest.QuestTypes.Virus) {

            }
        }
    }



}
