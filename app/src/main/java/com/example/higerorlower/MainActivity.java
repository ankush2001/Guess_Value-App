package com.example.higerorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void guessRandom(){
        //*We Have created a constructor to guess random numbers*//
        Random rand = new Random();

        random = rand.nextInt(20) + 1;
    }
        int random;
    public void clickButton(View v){
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int guessedValue =  Integer.parseInt(editText.getText().toString()); //**Converted String to Integer
       String message;
        if(guessedValue == random){
            message = "Correct" + " Guess play again";
            guessRandom(); //*again call the constructor to play again it will guess again
        }else if(guessedValue > random){
            message = "Lower";
        }else{
            message = "higher";

        }
        Log.i("Entered value",editText.getText().toString()); //**get the value which we have enterd
        Log.i("Random", String.valueOf(random));//** get random value in log as say back of operation
        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show(); //* This command will toast i.e.. a pop-up will be shown with in the app**//
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guessRandom(); //**Called Constructor when we open the app the random no will be guessed


        }
    }
