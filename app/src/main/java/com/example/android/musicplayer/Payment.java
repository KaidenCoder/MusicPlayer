package com.example.android.musicplayer;
/**
 * This project is done by Khaidem Sandip Singha under the Udacity Android Foundations Nanodegree program.
 *
 * I confirm that this submission is my own work. I have not used code from any other Udacity student's or graduate's submission of the same project.
 * I understand that Udacity will check my submission for plagiarism, and that failure to adhere to the Udacity Honor Code may result in the cancellation of my
 * enrollment.
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //Finds the view that shows Payment category payment button
        Button payment = findViewById(R.id.bt_payment);
        //Set a clickListener on that view
        payment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Connects to webPage
                Uri webPage = Uri.parse("https://www.paypal.com/in/signin");
                //Create a new intent to open the (@Link Implicit intent)
                Intent payIntent = new Intent(Intent.ACTION_VIEW, webPage);
                if (payIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(payIntent);
                }
            }
        });

        //Finds the view that shows payment category previous button
        Button paymentPrev= findViewById(R.id.bt_pr_payment);
        //Set a clickListener on that view
        paymentPrev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link Playlists)
                Intent paymentPrevIntent = new Intent(Payment.this,Playlists.class);
                //Start the new activity
                startActivity(paymentPrevIntent);
            }
        });

        //Finds the view that shows payment category main button
        Button paymentNext = findViewById(R.id.bt_main_payment);
        //Set a clickListener on that view
        paymentNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the (@Link MainActivity)
                Intent paymentNextIntent = new Intent(Payment.this,MainActivity.class);
                //Start the new activity
                startActivity(paymentNextIntent);
            }
        });
    }
}
