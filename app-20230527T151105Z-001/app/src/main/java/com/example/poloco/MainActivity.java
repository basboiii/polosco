package com.example.poloco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBeli1, btnBeli2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBeli1 = findViewById(R.id.btnBeli1);

        btnBeli2 = findViewById(R.id.btnBeli2);
        btnBeli2.setOnClickListener(V -> {
            Intent beli2 = new Intent(MainActivity.this, PesananActivity.class);
            startActivity(beli2);
            finish();
        });
    }
}