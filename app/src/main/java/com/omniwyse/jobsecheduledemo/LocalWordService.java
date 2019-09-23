package com.omniwyse.jobsecheduledemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Ramesh on 28/11/18.
 */
public class LocalWordService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(getApplicationContext(), "Hiiiii", Toast.LENGTH_SHORT).show();
    }
}
