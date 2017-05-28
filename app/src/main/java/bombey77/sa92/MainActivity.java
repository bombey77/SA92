package bombey77.sa92;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final static String LOG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        startService(new Intent(this, Service.class));
        Log.d(LOG, "startService");
    }

    public void stopService(View view) {
        stopService(new Intent(this, Service.class));
        Log.d(LOG, "stopService");
    }



}
