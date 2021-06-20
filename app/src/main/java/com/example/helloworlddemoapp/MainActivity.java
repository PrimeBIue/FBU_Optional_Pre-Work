package com.example.helloworlddemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.purple_200));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor((R.color.teal_200)));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Grab input text
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // Put Text into text view once change text 'button' is clicked if it is empty it sets
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Jorge!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset Text color to white
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.white));
                //Reset Background color to dark blue
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor((R.color.dark_blue)));
                //Reset Text to "Hello from Jorge"!
                ((TextView) findViewById(R.id.textView)).setText("Hello from Jorge!");
            }
        });


    }
}