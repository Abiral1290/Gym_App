package com.example.abiral.xampp.ui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.abiral.xampp.R;

public class Exercise_activity extends AppCompatActivity {

     private Uri uri;
     private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_activity);

        textView = (TextView) findViewById(R.id.txt_Desc);

        Uri uri =Uri.parse("android.resource://\"+getPackageName()+\"/\"+ID");
        VideoView videoView = (VideoView)findViewById(R.id.Videoview);
        videoView.setVideoURI(uri);
        videoView.start();









    }
}
