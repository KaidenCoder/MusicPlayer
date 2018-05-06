package com.example.android.musicplayer;
/**
 * This project is done by Khaidem Sandip Singha under the Udacity Android Foundations Nanodegree program.
 *
 * I confirm that this submission is my own work. I have not used code from any other Udacity student's or graduate's submission of the same project.
 * I understand that Udacity will check my submission for plagiarism, and that failure to adhere to the Udacity Honor Code may result in the cancellation of my
 * enrollment.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayingNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        //Finds the view that shows Playing Now category
        Button playNext = findViewById(R.id.bt_next_playNow);
        //Set a clickListener on that view
        playNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Artsits)
                Intent playNextIntent = new Intent(PlayingNow.this,Artists.class);
                //Start the new activity
                startActivity(playNextIntent);
            }
        });
    }
}
