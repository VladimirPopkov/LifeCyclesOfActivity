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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d(LOG, "ActivityTwo: onCreate");

        name = (TextView) findViewById(R.id.name);
        position = (TextView) findViewById(R.id.position);

        Worker worker = (Worker) getIntent().getParcelableExtra(
                Worker.class.getCanonicalName());
        name.setText("ФИО: " + worker.getName());
        position.setText("Должность: " + worker.getPosition());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "ActivityTwo: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "ActivityTwo: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "ActivityTwo: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "ActivityTwo: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "ActivityTwo: onDestroy");
    }
}
