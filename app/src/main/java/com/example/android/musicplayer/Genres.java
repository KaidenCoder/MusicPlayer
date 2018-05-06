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

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        //Finds the view that shows genres category previous button
        Button genresPrev= findViewById(R.id.bt_pr_genres);
        //Set a clickListener on that view
        genresPrev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Songs)
                Intent genresPrevIntent = new Intent(Genres.this,Songs.class);
                //Start the new activity
                startActivity(genresPrevIntent);
            }
        });

        //Finds the view that shows genres category next button
        Button genresNext = findViewById(R.id.bt_next_genres);
        //Set a clickListener on that view
        genresNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link PlayLists)
                Intent genresNextIntent = new Intent(Genres.this,Playlists.class);
                //Start the new activity
                startActivity(genresNextIntent);
            }
        });
    }
}
