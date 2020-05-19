package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CC2_SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_c2__second);

        TextView textView;
        textView = findViewById(R.id.textviewSecondActivity);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            textView.setText(bundle.getString("Text"));
        }
    }
}
