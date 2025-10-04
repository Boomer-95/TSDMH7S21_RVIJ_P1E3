package com.example.tsdmh7s21_rvij_p1e3;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {
    //Declaraciones de bottones
    Button btnp2 , btnp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    //Esto sirve para el cambio de pantalla
    public void onClick(View v) {
        Intent intent = new Intent(this, activity_p2.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(this, activity_p3.class);
        startActivity(intent);
    }





}