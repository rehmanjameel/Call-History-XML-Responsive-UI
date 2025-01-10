package org.base.callhistory;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.base.callhistory.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.basicCheckOut.setOnClickListener(v -> {

            Intent intent = new Intent(this, AnyNumberActivity.class);
            startActivity(intent);
        });

        binding.standardBT.setOnClickListener(v -> {
            Intent intent = new Intent(this, AnyNumberActivity.class);
            startActivity(intent);
        });

        binding.premiumBT.setOnClickListener(v -> {
            Intent intent = new Intent(this, AnyNumberActivity.class);
            startActivity(intent);
        });

    }
}