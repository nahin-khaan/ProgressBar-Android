package com.example.progreesbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progress;
    int prg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = findViewById(R.id.progressId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();

            }
        });
        thread.start();

        }
    public void doWork()
    {

        for(prg=20;prg<=100;prg=prg+20)
            try {
                Thread.sleep(1000);
                progress.setProgress(prg);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}