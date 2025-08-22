package com.example.androidactivitys_progra1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityRaiz extends AppCompatActivity {

    Button btnTextActivity;
    Button btnButtonActivity;
    Button btnWidgetsActivity;
    Button btnContainersActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_raiz);

        btnTextActivity = findViewById(R.id.btnTextActivity);
        btnButtonActivity = findViewById(R.id.btnButtonActivity);
        btnWidgetsActivity = findViewById(R.id.btnWidgetsActivity);
        btnContainersActivity = findViewById(R.id.btnContainersActivity);

        btnTextActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRaiz.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnButtonActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRaiz.this, ButtonsActivity.class);
                startActivity(intent);
            }
        });

        btnWidgetsActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRaiz.this, WidgetsActivity.class);
                startActivity(intent);
            }
        });

        btnContainersActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRaiz.this, ContainersActivity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}