package com.example.data_library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeMainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);
        textView = findViewById(R.id.id_joke);
        String s = getIntent().getStringExtra("key");
        textView.setText(s);
    }
}
