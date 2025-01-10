package org.base.callhistory;

import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.base.callhistory.databinding.ActivityFetchingDetailBinding;

public class FetchingDetailActivity extends AppCompatActivity {

    private ActivityFetchingDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFetchingDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.userName.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        float radius = binding.userName.getTextSize() / 3;
        BlurMaskFilter filter = new BlurMaskFilter(radius, BlurMaskFilter.Blur.NORMAL);
        binding.userName.getPaint().setMaskFilter(filter);
        binding.gender.getPaint().setMaskFilter(filter);
        binding.bD.getPaint().setMaskFilter(filter);
        binding.address.getPaint().setMaskFilter(filter);
        binding.location.getPaint().setMaskFilter(filter);

        binding.viewAllDetails.setOnClickListener(v -> {
            Intent intent = new Intent(this, CallsHistoryActivity.class);
            startActivity(intent);
        });
    }
}