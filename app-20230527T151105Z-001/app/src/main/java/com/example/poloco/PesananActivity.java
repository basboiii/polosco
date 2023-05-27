package com.example.poloco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PesananActivity extends AppCompatActivity {

    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        ivBack = findViewById(R.id.ivBackPesanan);
        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(PesananActivity.this, MainActivity.class);
            startActivity(back);
            finish();
        });
    }
}