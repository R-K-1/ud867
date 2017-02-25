package com.example.jokesdisplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by rkalonji on 02/18/2017.
 */

public class JokesDisplayer extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        Toast.makeText(this, i.getExtras().get("joke").toString(), Toast.LENGTH_LONG).show();
    }

}
