package com.example.task7intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sec extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        t = findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();
        String s = b.getString("text");
        t.setText(s);
    }
}