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

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Finds the view that shows songs category previous button
        Button songsPrev= findViewById(R.id.bt_pr_songs);
        //Set a clickListener on that view
        songsPrev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Albums)
                Intent songsPrevIntent = new Intent(Songs.this,Albums.class);
                //Start the new activity
                startActivity(songsPrevIntent);
            }
        });

        //Finds the view that shows songs category next button
        Button songsNext = findViewById(R.id.bt_next_songs);
        //Set a clickListener on that view
        songsNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Genres)
                Intent songsNextIntent = new Intent(Songs.this,Genres.class);
                //Start the new activity
                startActivity(songsNextIntent);
            }
        });
    }
}
