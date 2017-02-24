/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.rkalonji.myapplication.jokesTellerBackend;

import com.example.JokesTeller;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "jokesTellerBackend.myapplication.rkalonji.example.com",
                ownerName = "jokesTellerBackend.myapplication.rkalonji.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

    /**
     * A simple endpoint method that returns a joke
     */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        JokesTeller jokesTeller = new JokesTeller();
        MyBean response = new MyBean();
        response.setData(jokesTeller.getJoke());
        return response;
    }

}
