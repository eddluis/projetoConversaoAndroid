package com.ebatista.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

//        Double RC = intent.getDoubleExtra(MainActivity.RC);

        // Capture the layout's TextView and set the string as it5s text
        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);
    }
}
