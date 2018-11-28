package com.omniwyse.jobsecheduledemo;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

/**
 * Created by Chandra Kant on 28/11/18.
 */
public class TestJobService  extends JobService {
    private static final String TAG = "SyncService";

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onStartJob(JobParameters params) {
        Intent service = new Intent(getApplicationContext(), LocalWordService.class);
        getApplicationContext().startService(service);
        Util.scheduleJob(getApplicationContext()); // reschedule the job
        Toast.makeText(getApplicationContext(), "Hiiiii", Toast.LENGTH_SHORT).show();

        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}
