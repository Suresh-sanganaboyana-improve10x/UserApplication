package com.example.userapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.userapplication.R;
import com.example.userapplication.databinding.ActivityGeneratorRandomUsersBinding;

public class GeneratorRandomUsersActivity extends AppCompatActivity {

    private ActivityGeneratorRandomUsersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGeneratorRandomUsersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}