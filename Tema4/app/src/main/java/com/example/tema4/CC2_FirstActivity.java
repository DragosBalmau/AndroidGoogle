package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CC2_FirstActivity extends AppCompatActivity {

    public static String  Text1 = "1";
    public static String  Text2 = "2";
    public static String  Text3 = "3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_c2__first);
    }

    public void openSecondActivity(View view) {

        Intent intent = new Intent(CC2_FirstActivity.this, CC2_SecondActivity.class);

        if(view.getId() == R.id.textoneButton)
            intent.putExtra("Text","TextOne");

        if(view.getId() == R.id.texttwoButton)
            intent.putExtra("Text","TextTwo");

        if(view.getId() == R.id.textthreeButton)
            intent.putExtra("Text","TextThree");

        startActivity(intent);
    }


}
