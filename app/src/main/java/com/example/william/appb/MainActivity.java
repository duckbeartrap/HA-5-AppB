package com.example.william.appb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private String MessageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        Intent intent = getIntent();
        intent.getAction();
        intent.getType();
        MessageText = intent.getStringExtra(Intent.EXTRA_TEXT);
        tvMessage.setText(MessageText);

    }

    public void init(){
        tvMessage = findViewById(R.id.tvMessage);
    }
}
