package com.example.kong56230.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {
        private static final String TAG = SynthesizerActivity.class.getName();
        public Button button1;
        public Button button2;
        public MediaPlayer mpA;
        public MediaPlayer mpB;
        public MediaPlayer mpC;
        public MediaPlayer mpCs;
        public MediaPlayer mpD;
        public MediaPlayer mpE;
        public MediaPlayer mpEE;
        public MediaPlayer mpF;
        public MediaPlayer mpFF;
        private final int WHOLE_NOTE = 1000;
        ArrayList<MediaPlayer> twinklestar;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_synthesizer);

            Button button1 = (Button) findViewById(R.id.adelebutton);
            mpA = MediaPlayer.create(this, R.raw.scalea);
            mpEE = MediaPlayer.create(this, R.raw.scalef);
            mpFF = MediaPlayer.create(this, R.raw.scalehighfs);
            mpB = MediaPlayer.create(this, R.raw.scaleb);
            mpC = MediaPlayer.create(this, R.raw.scalec);
            mpCs = MediaPlayer.create(this, R.raw.scalecs);
            mpD = MediaPlayer.create(this, R.raw.scaled);
            mpE = MediaPlayer.create(this, R.raw.scalee);
            mpF = MediaPlayer.create(this, R.raw.scalef);

            twinklestar = new ArrayList<>();

            twinklestar.add(mpA);
            twinklestar.add(mpA);
            twinklestar.add(mpEE);
            twinklestar.add(mpEE);
            twinklestar.add(mpFF);
            twinklestar.add(mpFF);
            twinklestar.add(mpEE);
            twinklestar.add(mpD);
            twinklestar.add(mpD);
            twinklestar.add(mpCs);
            twinklestar.add(mpCs);
            twinklestar.add(mpB);
            twinklestar.add(mpB);
            twinklestar.add(mpA);
        }

        private void delayPlaying(int delay) throws InterruptedException{
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Log.e("SynthesizerActivity","Audio playback interrupted");
            }
        }
    }

    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG,"Button 1 Clicked");
        mpE.start();

    }
    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.i(TAG,"Button 2 Clicked");
        mpF.start();

    }
    mChallenge1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
        try {
        mpE.start();
        delayPlaying(WHOLE_NOTE);
        mpF.start();
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
        });
}