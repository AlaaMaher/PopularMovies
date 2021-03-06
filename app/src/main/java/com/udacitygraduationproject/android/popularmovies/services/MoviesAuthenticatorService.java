package com.udacitygraduationproject.android.popularmovies.services;

/**
 * Created by almanara on 01/02/2016.
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class MoviesAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private MoviesAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new MoviesAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}