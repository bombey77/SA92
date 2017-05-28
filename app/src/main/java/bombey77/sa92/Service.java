package bombey77.sa92;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ромашка on 26.05.2017.
 */

public class Service extends android.app.Service {

    private static final String LOG = "myLogs";

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(LOG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOG, "onStartCommand");
        foilService();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy");
    }

    public void foilService() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.d(LOG, "i = " + i);
                }
                stopSelf();
            }
        }).start();

    }
}
