package com.example.jokesdisplayer;

import android.content.Context;
import android.content.Intent;

/**
 * Created by rkalonji on 02/18/2017.
 */

public class JokesDisplayer {

    public void launchJokeActivity (Context context, String joke) {
        Intent i = new Intent(context, JokeActivity.class);
        i.putExtra("joke", joke);
        context.startActivity(i);
    }

}
