package com.udacity.gradle.androidTest;

import android.content.Context;
import android.content.pm.InstrumentationInfo;
import android.icu.util.TimeUnit;
import android.os.AsyncTask;
import android.support.v4.util.Pair;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import android.support.test.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;

/**
 * Created by rkalonji on 02/27/2017.
 */

// @RunWith(AndroidJUnit4.class)
public class GetJokeAndroidTest {

    @Test
    public void verifyAsyncTaskReturnJoke() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

/*        endpointsAsyncTask.execute(new Pair<Context, String>(this.getApplicationContext(), "Manfred"));
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (endpointsAsyncTask.getHasExecuted() == false);*/

        assertFalse(endpointsAsyncTask.getJoke() == "");
    }
}
