package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash3);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Initialize the button
        Button button = findViewById(R.id.button3);

        // Set an OnClickListener for the button
        button.setOnClickListener(view -> {
            // Create an Intent to switch to the login activity
            Intent intent = new Intent(splash3.this, login.class);
            startActivity(intent);
            // Apply the animation
            overridePendingTransition(R.anim.slide_left, R.anim.slide_right);
        });
    }
}
