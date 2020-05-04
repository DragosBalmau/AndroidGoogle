package com.example.tema2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class LogInActivity extends AppCompatActivity {

    private EditText emailAddressEditText;
    private EditText phoneAddressEditText;
    private CheckBox terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        emailAddressEditText = findViewById(R.id.emailAddressEditText);
        phoneAddressEditText = findViewById(R.id.phoneEditText);
        terms = findViewById(R.id.checkBox);


        emailAddressEditText.setText("android@gmail.com");

    }

    public void loginOnClick(View view) {

        String email = emailAddressEditText.getText().toString();

        String phone = phoneAddressEditText.getText().toString();

        if (email.isEmpty()) {
            emailAddressEditText.setError("Please fill the email address");
        }
        if (phone.isEmpty()) {
            phoneAddressEditText.setError("Please fill the phone number");
        }

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (email.matches(emailPattern))
        {
            Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
        }

        if (terms.isChecked() == false) {

            Toast.makeText(this, "Please check this", Toast.LENGTH_LONG).show();

        }

        if (!email.isEmpty() && !phone.isEmpty()) {
            //Toast.makeText(this, email + phone, Toast.LENGTH_LONG).show();

        }
    }
}
