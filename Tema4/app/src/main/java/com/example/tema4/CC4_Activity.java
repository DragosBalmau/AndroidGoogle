package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class CC4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_c4_);
    }


    public void openCall(View view) {

        EditText editText = findViewById(R.id.callEditText);
        Intent callImpliciIntent = new Intent(Intent.ACTION_DIAL);
        callImpliciIntent.setData(Uri.parse("tel:"+editText.getText()));
        startActivity(callImpliciIntent);

    }

    public void openLocation(View view) {

        EditText editText = findViewById(R.id.locationEditText);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q="+editText.getText().toString()));
        startActivity(intent);

    }

    public void shareText(View view) {

        EditText editText = findViewById(R.id.texteditText);
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);

    }

    public void openWebsite(View view) {

        EditText editText = findViewById(R.id.websiteEditText);
        Intent openUrlImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openUrlImplicitIntent.setData(Uri.parse(editText.getText().toString()));
        startActivity(openUrlImplicitIntent);

    }
}
