package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.example.spotify.R.layout.song_structure;

public class MainActivity extends AppCompatActivity{
    private final int[] songs = {R.drawable.song1,R.drawable.song2,R.drawable.song3,R.drawable.song4,R.drawable.song5,R.drawable.song6,R.drawable.song7,R.drawable.song8,R.drawable.song9,R.drawable.song10};
    private final String[] s = {"Believer","Shape of you","Despacito","Beat it","Girls like you","Dangerous","Earth song","Baby","Holy","Sorry"};
    private final int[] songs2 = {R.drawable.firstsong,R.drawable.secondsong,R.drawable.thirdsong,R.drawable.fourthsong,R.drawable.fifthsong,R.drawable.sixthsong,R.drawable.seventhsong,R.drawable.eigthsong,R.drawable.ninthsong,R.drawable.tenthsong};
    private final String[] s2 = {"As I am","Boyfriend","Cheaptrills","Buttabomma","Yenti Yenti","Rangamma mangamma","Vachinde","Why this kolaveri","Rowdy Baby","Raamuloo Ramulaa"};
    private final int[] songs3 = {R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth,R.drawable.fifth,R.drawable.sixth,R.drawable.seventh,R.drawable.eigth, R.drawable.ninth,R.drawable.tenth};
    private final String[] s3 = {"Nee kannu neeli samudram","Taragadhi daati","sarileru neekevvaru","Daang Daang","He's so cute","Saahore baahubali","Anaganaganagaaa","Peniviti","Yeda poyinaadoo","Reddy ikkada suuudu"};
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.l1);
        LinearLayout linearLayout2 = findViewById(R.id.l2);
        LinearLayout l3 = findViewById(R.id.l3);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        mediaPlayer = MediaPlayer.create(this,R.raw.song1);
        for(int i=0; i<s.length;i++){
            int finalI = i;
            View view = layoutInflater.inflate(song_structure, linearLayout, false);
            ImageView imageView = view.findViewById(R.id.SongImage);
            imageView.setImageResource(songs[i]);
            TextView tv = view.findViewById(R.id.SongName);
            tv.setText(String.valueOf(s[i]));
            linearLayout.addView(view);
            MediaPlayer m = MediaPlayer.create(this, R.raw.song1);
            view.setOnClickListener(v -> {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    Toast.makeText(this, "Song has been paused", Toast.LENGTH_SHORT).show();
                }
                else {
                    mediaPlayer.start();
                    Toast.makeText(this, "Song has been resumed", Toast.LENGTH_SHORT).show();
                }
            });

            View view2 = layoutInflater.inflate(song_structure, linearLayout2, false);
            ImageView imageView2 = view2.findViewById(R.id.SongImage);
            imageView2.setImageResource(songs2[i]);
            TextView tv2 = view2.findViewById(R.id.SongName);
            tv2.setText(String.valueOf(s2[i]));
            linearLayout2.addView(view2);
            view2.setOnClickListener(v -> {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    Toast.makeText(this, "Song has been paused", Toast.LENGTH_SHORT).show();
                }
                else {
                    mediaPlayer.start();
                    Toast.makeText(this, "Song has been resumed", Toast.LENGTH_SHORT).show();
                }
            });

            View view3 = layoutInflater.inflate(song_structure, l3, false);
            ImageView imageView3 = view3.findViewById(R.id.SongImage);
            imageView3.setImageResource(songs3[i]);
            TextView tv3 = view3.findViewById(R.id.SongName);
            tv3.setText(String.valueOf(s3[i]));
            l3.addView(view3);
            view3.setOnClickListener(v -> {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    Toast.makeText(this, "Song has been paused", Toast.LENGTH_SHORT).show();
                }
                else {
                    mediaPlayer.start();
                    Toast.makeText(this, "Song has been resumed", Toast.LENGTH_SHORT).show();
                }
            });
            BottomNavigationView menu = findViewById(R.id.navigation);
            menu.setOnNavigationItemSelectedListener(navListener);
            Toast.makeText(this, "Please click on a song to start playing and to pause the song click on it again", Toast.LENGTH_SHORT).show();
        }

    }
    @SuppressLint("NonConstantResourceId")
    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                switch(item.getItemId()){
                    case R.id.home:
                        break;
                    case R.id.search:
                        startActivity(new Intent(MainActivity.this, SearchActivity.class));
                        break;
                    case R.id.library :
                        startActivity(new Intent(MainActivity.this, LibraryActivity.class));
                        break;
                    case R.id.Premium:
                        startActivity(new Intent(MainActivity.this, PremiumActivity.class));
                }
                return false;
            };
}