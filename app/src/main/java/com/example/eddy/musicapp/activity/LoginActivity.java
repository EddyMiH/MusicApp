package com.example.eddy.musicapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.eddy.musicapp.R;
import com.example.eddy.musicapp.fragment.GenreGridFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        GenreGridFragment genreGridFragment = new GenreGridFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, genreGridFragment)
                .addToBackStack(null).commit();
    }
}
