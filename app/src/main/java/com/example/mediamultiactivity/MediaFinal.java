package com.example.mediamultiactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MediaFinal extends AppCompatActivity {
    private TextView mediaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_final);
        Intent it = getIntent();
        if (it !=null){
            Bundle params = it.getExtras();
            if (params != null){
                String media = params.getString("media");
                mediaTextView = findViewById(R.id.textViewMediaFinal);
                mediaTextView.setText(media);
            }
        }


    }
}