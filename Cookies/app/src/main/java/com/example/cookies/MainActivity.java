package com.example.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean toggle = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {

        if(toggle) {
            // Find a reference to the ImageView in the layout. Change the image.
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.after_cookie);

            // Find a reference to the TextView in the layout. Change the text.
            TextView textView = (TextView) findViewById(R.id.button);
            textView.setText("I'm so full");
            toggle=false;
        }else{
            // Find a reference to the ImageView in the layout. Change the image.
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.before_cookie);

            // Find a reference to the TextView in the layout. Change the text.
            TextView textView = (TextView) findViewById(R.id.button);
            textView.setText("eat cookie");
            toggle=true;
        }
    }
}
