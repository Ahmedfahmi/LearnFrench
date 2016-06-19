package com.ahmedfahmi.learnfrench;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        int btnId = view.getId(); //get int id
        String ourId = "";
        ourId = getResources().getResourceEntryName(btnId); //get String id (hello) but we need to make it a resource
        int identifier = getResources().getIdentifier(ourId, "raw", getPackageName()); // get the resource of the ourid//
        MediaPlayer mediaPlayer = MediaPlayer.create(this, identifier);// button id must be the same as resources to work
        mediaPlayer.start();
    }
}
