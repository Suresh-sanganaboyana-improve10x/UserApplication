package com.example.userapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.userapplication.databinding.ActivityHomeBinding;
import com.example.userapplication.users.GeneratorRandomUsersActivity;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Home");
        handleGeneratorRandomUsersBtn();
    }

    private void handleGeneratorRandomUsersBtn() {
        binding.genearteRandomUsersBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, GeneratorRandomUsersActivity.class);
            startActivity(intent);
        });
    }
}