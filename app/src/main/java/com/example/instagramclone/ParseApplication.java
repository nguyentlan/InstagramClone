package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("deT61WxB1BzTOEEFO0NhVM4wxKb5giupwvsP77cV") // should correspond to Application Id env variable
                .clientKey("cGNPXDOGrn23gcxqk9UHwGpcvxUMn5tOD9VvRf83")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
