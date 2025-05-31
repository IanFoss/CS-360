package com.example.ianfoss_modulethreeassignment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Inflates main activity
        setContentView(R.layout.activity_main);

        // References EditText and hello button in layout
        EditText nameText = findViewById(R.id.nameText);
        Button buttonSayHello = findViewById(R.id.buttonSayHello);

        // Text watched enables button when edit text field is not empty
        nameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Enables hello button when edit text field is not empty
                buttonSayHello.setEnabled(!s.toString().trim().isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    // Function called when say hello button is clicked
    public void SayHello(View view) {

        // References EditText in layout
        EditText nameText = findViewById(R.id.nameText);

        // Checks if text field is null
        if (nameText != null) {

            // References text view in layout and displays greeting
            TextView textGreeting = findViewById(R.id.textGreeting);

            // Obtains EditText input and converts to String
            String name = nameText.getText().toString();


            String completeGreeting = String.format(getString(R.string.greeting) + " " + name);

            textGreeting.setText(completeGreeting);

        }

        // Function returns if nameText is null
        else {
            return;
        }
    }

}