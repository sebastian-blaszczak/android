package com.example.kawezamawiam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int value = 0;
    private int price = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayPrice(calculatePrice(value,price));
    }

    public int calculatePrice(int cost,int quantity){
        return cost*quantity;
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText("Total : " + NumberFormat.getCurrencyInstance().format(number));
    }

    public void plusOrder(View view) {
        value += 1;
        display(value);
    }

    public void minusOrder(View view) {
        if (value > 0) {
            value -= 1;
            display(value);
        }

    }
}
