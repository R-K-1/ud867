package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;

/**
 * Created by rkalonji on 02/27/2017.
 */

@RunWith(AndroidJUnit4.class)
public class GetJokeAndroidTest {

    @Test
    public void verifyAsyncTaskReturnJoke() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

        endpointsAsyncTask.execute(new android.support.v4.util.Pair<Context, String>(InstrumentationRegistry.getTargetContext(), "Manfred"));
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (endpointsAsyncTask.getHasExecuted() == false);

        assertFalse(endpointsAsyncTask.getJoke() == "");
    }
}
