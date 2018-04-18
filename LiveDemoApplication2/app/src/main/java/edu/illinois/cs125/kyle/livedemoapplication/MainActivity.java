package edu.illinois.cs125.kyle.livedemoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        textView = findViewById(R.id.textView); // this was the wrong value during the demo, fixed now
    }


    protected void increment(View view) {
        counter ++;
        textView.setText(String.valueOf(counter));
    }
}
