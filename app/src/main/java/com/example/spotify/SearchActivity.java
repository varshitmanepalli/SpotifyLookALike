package com.example.spotify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                switch(item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(SearchActivity.this, MainActivity.class));
                        break;
                    case R.id.search:
                        break;
                    case R.id.library :
                        startActivity(new Intent(SearchActivity.this, LibraryActivity.class));
                        break;
                    case R.id.Premium:
                        startActivity(new Intent(SearchActivity.this, PremiumActivity.class));
                }
                return false;
            };
}
