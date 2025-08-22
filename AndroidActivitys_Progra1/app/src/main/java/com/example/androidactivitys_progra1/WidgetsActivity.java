package com.example.androidactivitys_progra1;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WidgetsActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button btnIrARaizWidgets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_widgets);

        ratingBar = findViewById(R.id.ratingBar);
        btnIrARaizWidgets = findViewById(R.id.btnIrarAizWidgets);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 1) {
                    Toast.makeText(WidgetsActivity.this, "😞 Pues busca otra app", Toast.LENGTH_SHORT).show();
                    finishAffinity();
                } else if (rating == 2) {
                    Toast.makeText(WidgetsActivity.this, "🙁 No me gusta", Toast.LENGTH_SHORT).show();
                    finish();
                } else if (rating == 3) {
                    Toast.makeText(WidgetsActivity.this, "🤨 Mmmmmmmm", Toast.LENGTH_SHORT).show();
                } else if (rating == 4) {
                    Toast.makeText(WidgetsActivity.this, "🙂 Esta bien", Toast.LENGTH_SHORT).show();
                } else if (rating == 5) {
                    Toast.makeText(WidgetsActivity.this, "😄 Gracias", Toast.LENGTH_SHORT).show();
                }
            }});

        btnIrARaizWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}