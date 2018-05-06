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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds the view that shows artists category
        TextView playNow = findViewById(R.id.playActivity);
        //Set a clickListener on that view
        playNow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Artists)
                Intent playIntent = new Intent(MainActivity.this,PlayingNow.class);
                //Start the new activity
                startActivity(playIntent);
            }
        });

        //Finds the view that shows artists category
        TextView artists = findViewById(R.id.artists);
        //Set a clickListener on that view
        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Artists)
                Intent artistsIntent = new Intent(MainActivity.this,Artists.class);
                //Start the new activity
                startActivity(artistsIntent);
            }
        });

        //Finds the view that shows albums category
        TextView albums = findViewById(R.id.albums);
        //Set a clickListener on that view
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Albums)
                Intent albumsIntent = new Intent(MainActivity.this,Albums.class);
                //Start the new activity
                startActivity(albumsIntent);
            }
        });

        //Finds the view that shows songs category
        TextView songs = findViewById(R.id.songs);
        //Set a clickListener on that view
        songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link SONGS)
                Intent songsIntent = new Intent(MainActivity.this,Songs.class);
                //Start the new activity
                startActivity(songsIntent);
            }
        });

        //Finds the view that shows genres category
        TextView genres = findViewById(R.id.genres);
        //Set a clickListener on that view
        genres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Genres)
                Intent genresIntent = new Intent(MainActivity.this,Genres.class);
                //Start the new activity
                startActivity(genresIntent);
            }
        });

        //Finds the view that shows playLists category
        TextView playLists = findViewById(R.id.playlists);
        //Set a clickListener on that view
        playLists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Playlists)
                Intent playListsIntent = new Intent(MainActivity.this,Playlists.class);
                //Start the new activity
                startActivity(playListsIntent);
            }
        });

        //Finds the view that shows payment category
        TextView payment = findViewById(R.id.payment);
        //Set a clickListener on that view
        payment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Payment)
                Intent paymentIntent = new Intent(MainActivity.this,Payment.class);
                //Start the new activity
                startActivity(paymentIntent);
            }
        });
    }
}
