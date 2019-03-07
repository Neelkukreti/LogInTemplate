package com.sandbox.login.logintemplate;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ConstraintLayout mylayout; //call the constraint layout in your main layout xml
    AnimationDrawable animationdrawable; //make a new animation drawable file , class needs to be imported
//my anime log in newly created, first second and third item are gradient colors
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylayout=(ConstraintLayout) findViewById(R.id.my_layout);

        animationdrawable=(AnimationDrawable) mylayout.getBackground();

        animationdrawable.setEnterFadeDuration(4500);
        animationdrawable.setExitFadeDuration(4500);
        animationdrawable.start();
    }
}
