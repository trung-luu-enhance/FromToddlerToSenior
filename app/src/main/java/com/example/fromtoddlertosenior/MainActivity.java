package com.example.fromtoddlertosenior;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout activity_main;
    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = findViewById(R.id.activity_main);
        activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView age_num_tv = (TextView)findViewById(R.id.age_num_tv);
                age_num_tv.setText(Integer.toString(counter));
                CharSequence stage;
                if (counter < 2)
                    stage = "NEWBORN";
                else if (counter < 6)
                    stage = "TODDLER";
                else if (counter < 11)
                    stage = "CHILD";
                else if (counter < 19)
                    stage = "TEEN";
                else if (counter < 31)
                    stage = "ADULT";
                else if (counter < 51)
                    stage = "MIDDLE AGED";
                else
                    stage = "SENIOR";
                TextView stage_text_tv = (TextView)findViewById(R.id.stage_text_tv);
                stage_text_tv.setText(stage);
                counter = (counter < 99) ? counter + 1 : 0;
            }
        });
    }
}
