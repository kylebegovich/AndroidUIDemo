package edu.illinois.cs125.kyle.basicdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        textView = findViewById(R.id.textView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "STOP!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "Hammertime!");
    }

    // need the parameter for the ability to callback to it
    protected void increment(View view) {
        counter ++;
        textView.setText(String.valueOf(counter));
    }

    protected void decrement(View view) {
        counter --;
        textView.setText(String.valueOf(counter));
    }

    protected void randomNumber(View view) {
        counter = (int) ((Math.random() - 0.5) * Integer.MAX_VALUE);
        textView.setText(String.valueOf(counter));
    }


    /*
    Using Logcat, from developer.android.com:

    Generally, you should use the Log.v(), Log.d(), Log.i(), Log.w(), and Log.e() methods to write logs.
    You can then view the logs in logcat.

    The order in terms of verbosity, from most to least is VERBOSE, DEBUG, INFO, WARN, ERROR.
    Verbose should never be compiled into an application except during development.
    Debug logs are compiled in but stripped at runtime. Error, warning and info logs are always kept.
     */
}
