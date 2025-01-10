package org.base.callhistory;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.base.callhistory.databinding.ActivityCallsHistoryBinding;

public class CallsHistoryActivity extends AppCompatActivity {

    private ActivityCallsHistoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCallsHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}