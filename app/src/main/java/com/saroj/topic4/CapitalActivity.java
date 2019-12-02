package com.saroj.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        TextView tvText = findViewById(R.id.tvText);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String message = bundle.getString("Capital");
            tvText.setText(message);
        }else {
            Toast.makeText(this,"No Capital",Toast.LENGTH_LONG).show();
        }
    }
}
