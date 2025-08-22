package com.example.androidactivitys_progra1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonsActivity extends AppCompatActivity {

    CheckBox checkBox;
    TextView tvCheckbox;
    ImageButton imageButton;
    Switch switch1;
    ImageView imageView;
    TextView tvimagenswitch;
    Button btnSalidaButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buttons);

        checkBox = findViewById(R.id.checkBox);
        tvCheckbox = findViewById(R.id.tvCheckbox);
        imageButton = findViewById(R.id.ImageButton2);
        switch1 = findViewById(R.id.switch1);
        imageView = findViewById(R.id.imageView);
        tvimagenswitch = findViewById(R.id.tvimagenswitch);
        btnSalidaButtons = findViewById(R.id.btnSalidaButtons);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tvCheckbox.setText("Checkbox seleccionado");
                } else {
                    tvCheckbox.setText("Checkbox no seleccionado");
                }
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonsActivity.this, "Adios!!", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageView.setVisibility(View.VISIBLE);
                    tvimagenswitch.setVisibility(View.VISIBLE);
                } else {
                    imageView.setVisibility(View.INVISIBLE);
                    tvimagenswitch.setVisibility(View.INVISIBLE);
                }
            }});

                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });

                btnSalidaButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
