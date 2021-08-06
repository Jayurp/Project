package com.example.project;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton Schedule,Typed_Notes,Enotes,Scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Schedule = findViewById(R.id.Schedule);
        Typed_Notes = findViewById(R.id.Typed_Notes);
        Enotes = findViewById(R.id.Enotes);
        Scanner = findViewById(R.id.Scanner);

        Enotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startact_enotes();
            }
        });

        Scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startact_scanner();
            }
        });

    }
    public void startact_enotes()
    {
        Intent intent = new Intent(this, ENOTES.class);
        startActivity(intent);
    }

    public void startact_scanner()
    {
        Intent intent = new Intent(this, SCANNER.class);
        startActivity(intent);
    }
}
