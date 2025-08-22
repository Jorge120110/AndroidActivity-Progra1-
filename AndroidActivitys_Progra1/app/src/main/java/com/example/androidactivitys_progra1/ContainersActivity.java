package com.example.androidactivitys_progra1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContainersActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView ivContainersFuturista;
    ImageView ivContainersMonatanas;
    ImageView ivContainersCieloAzul;
    ImageView ivContainersHollowKnight;
    Button btnSalidaButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_containers);

        spinner = findViewById(R.id.spinner);
        ivContainersFuturista = findViewById(R.id.ivContainersFuturista);
        ivContainersCieloAzul = findViewById(R.id.ivContainersCieloAzul);
        ivContainersMonatanas = findViewById(R.id.ivContainersMontanas);
        ivContainersHollowKnight = findViewById(R.id.ivContainersHollowKnight);
        btnSalidaButtons = findViewById(R.id.Salidabutton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                if (selectedItem.equals("Montañas")) {
                    ivContainersMonatanas.setVisibility(View.VISIBLE);
                    ivContainersFuturista.setVisibility(View.INVISIBLE);
                    ivContainersCieloAzul.setVisibility(View.INVISIBLE);
                    ivContainersHollowKnight.setVisibility(View.INVISIBLE);

                } if (selectedItem.equals("Futurista")) {
                    ivContainersFuturista.setVisibility(View.VISIBLE);
                    ivContainersMonatanas.setVisibility(View.INVISIBLE);
                    ivContainersCieloAzul.setVisibility(View.INVISIBLE);
                    ivContainersHollowKnight.setVisibility(View.INVISIBLE);

                } if (selectedItem.equals("Cielo Azul")) {
                    ivContainersCieloAzul.setVisibility(View.VISIBLE);
                    ivContainersMonatanas.setVisibility(View.INVISIBLE);
                    ivContainersFuturista.setVisibility(View.INVISIBLE);
                    ivContainersHollowKnight.setVisibility(View.INVISIBLE);

                } if (selectedItem.equals("Hollow Knight")) {
                    ivContainersHollowKnight.setVisibility(View.VISIBLE);
                    ivContainersMonatanas.setVisibility(View.INVISIBLE);
                    ivContainersFuturista.setVisibility(View.INVISIBLE);
                    ivContainersCieloAzul.setVisibility(View.INVISIBLE);

                } if (selectedItem.equals("Selecciona un fondo")){
                    ivContainersMonatanas.setVisibility(View.INVISIBLE);
                    ivContainersFuturista.setVisibility(View.INVISIBLE);
                    ivContainersCieloAzul.setVisibility(View.INVISIBLE);
                    ivContainersHollowKnight.setVisibility(View.INVISIBLE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

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