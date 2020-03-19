package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
* In this application we will learn how to switch from one activity to another activity.
*
* Step 1:
* Click on res->layout(click right click on this)->New->Activity->Empty Activity.
*
* Step 2:
* Give Name of your activity and Click on Finish.
*
* Step3:
* You will see your activity name class in Java Section  and activity_(activity name) in layout section.
*
* Step 4:
* Now move to Main Activity and start coding as given below.
*
*
* */
public class MainActivity extends AppCompatActivity {
    Button button; //Using this we give object to the Button class as button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Already taught in previous class
        button=findViewById(R.id.btn); //Here we find the id of button using findViewById()

        /* We use this setOnClickListener as name suggest that when we click on this button it will call
        * this function and perform action as mentioned in this function.
        * */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /*
                * For Changing activity we use Intent class in which we pass Context(Name of First class where you
                * are ) with .this(extension)  and Second class(Where you want to move) with .class(extension)
                *
                * example: Intent intent=new Intent(firstclass.this,secondclass.class);
                * */
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);

                /*Now we want to start activity then we have to use startActivity(intent). */
                startActivity(intent);


                /*After this we will Run the program and then When we click on Click Me button then we will easily
                * Move to next activity.
                * */
            }
        });
    }
}
