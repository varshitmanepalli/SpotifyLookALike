package com.example.spotify;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PremiumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                switch(item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(PremiumActivity.this, MainActivity.class));
                        break;
                    case R.id.search:
                        startActivity(new Intent(PremiumActivity.this, SearchActivity.class));
                        break;
                    case R.id.library :
                        startActivity(new Intent(PremiumActivity.this, LibraryActivity.class));
                        break;
                    case R.id.Premium:
                        break;
                }
                return false;
            };
}
