package com.example.jokesdisplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rkalonji on 02/27/2017.
 */

public class JokeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.joke);

        Intent i = getIntent();
        TextView jokeView = (TextView) findViewById(R.id.joke_text_view);
        jokeView.setText(i.getExtras().get("joke").toString());
    }
}