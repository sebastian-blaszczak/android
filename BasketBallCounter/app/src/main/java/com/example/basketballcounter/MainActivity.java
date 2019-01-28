package com.example.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int points=0;
    private int pointsB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ThreePoints(View view) {
        points+=3;
        display(points);
    }

    public void TwoPoints(View view) {
        points+=2;
        display(points);
    }

    public void OnePoints(View view) {
        points+=1;
        display(points);
    }

    public void ThreePointsB(View view) {
        pointsB+=3;
        displayB(pointsB);
    }

    public void TwoPointsB(View view) {
        pointsB+=2;
        displayB(pointsB);
    }

    public void OnePointsB(View view) {
        pointsB+=1;
        displayB(pointsB);
    }

    public void display(int value){
            TextView pointsTextView = (TextView) findViewById(R.id.points);
            pointsTextView.setText("" + value);
    }

    public void displayB(int value){
        TextView pointsTextView = (TextView) findViewById(R.id.pointsB);
        pointsTextView.setText("" + value);
    }

    public void Reset(View view) {
        points=0;
        pointsB=0;
        display(points);
        displayB(pointsB);
    }
}
