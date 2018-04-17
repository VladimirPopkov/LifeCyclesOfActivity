package ru.startandroid.lifecyclesofactivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by v.popkov on 17.04.2018.
 */
public class ActivityTwo extends AppCompatActivity {

    final String LOG = "State";
    TextView name;
    TextView position;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_two);

        name = (TextView) findViewById(R.id.name);
        position = (TextView) findViewById(R.id.position);
        Log.d(LOG, "getParcelableExtra");

        Worker worker = (Worker) getIntent().getParcelableExtra(
                Worker.class.getCanonicalName());
        name.setText(worker.getName());
        position.setText(worker.getPosition());
        Log.d(LOG, "myObj: " + worker.getName() + ", " + worker.getPosition());
        Log.d(LOG, "Ghbdtn");
    }
}
