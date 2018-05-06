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

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Finds the view that shows albums category previous button
        Button albumsPrev= findViewById(R.id.bt_pr_albums);
        //Set a clickListener on that view
        albumsPrev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Artists)
                Intent albumsPrevIntent = new Intent(Albums.this,Artists.class);
                //Start the new activity
                startActivity(albumsPrevIntent);
            }
        });

        //Finds the view that shows albums category next button
        Button albumsNext = findViewById(R.id.bt_next_albums);
        //Set a clickListener on that view
        albumsNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Songs)
                Intent albumsNextIntent = new Intent(Albums.this,Songs.class);
                //Start the new activity
                startActivity(albumsNextIntent);
            }
        });
    }
}
