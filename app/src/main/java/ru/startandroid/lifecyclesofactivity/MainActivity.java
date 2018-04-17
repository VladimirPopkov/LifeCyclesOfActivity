package ru.startandroid.lifecyclesofactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String LOG = "State";
    Button button;
    EditText name;
    EditText position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.editName);
        position = (EditText) findViewById(R.id.editPosition);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Worker worker = new Worker(name.getText().toString(), position.getText().toString());
                Intent intent = new Intent("showActivityTwo");
                intent.putExtra(Worker.class.getCanonicalName(), worker);
                Log.d(LOG, Worker.class.getCanonicalName());
                Log.d(LOG, "myObj: " + worker.getName() + ", " + worker.getPosition());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy");
    }
}
