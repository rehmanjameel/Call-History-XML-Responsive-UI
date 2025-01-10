package org.base.callhistory;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.base.callhistory.databinding.ActivityAnyNumberBinding;

public class AnyNumberActivity extends AppCompatActivity {

    private ActivityAnyNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnyNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.getDetailBT.setOnClickListener(v -> {
            Intent intent = new Intent(this, FetchingDetailActivity.class);
            startActivity(intent);
        });

        binding.backButton.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}