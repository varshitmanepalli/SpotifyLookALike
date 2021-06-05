package com.example.spotify;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                switch(item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(LibraryActivity.this, MainActivity.class));
                        break;
                    case R.id.search:
                        startActivity(new Intent(LibraryActivity.this, SearchActivity.class));
                        break;
                    case R.id.library :

                        break;
                    case R.id.Premium:
                        startActivity(new Intent(LibraryActivity.this, LibraryActivity.class));
                        break;
                }
                return false;
            };
}
