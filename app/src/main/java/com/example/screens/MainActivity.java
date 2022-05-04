package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {


    private EditText username;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainActivity Created.");
        username = findViewById(R.id.login_text);
        Button signin = findViewById(R.id.sign_in_button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "MainActivity Sign in button Pressed.");
                Log.d("==>", "Username"+username.getText().toString());
                Intent intent = new Intent(MainActivity.this, screen2.class);


                intent.putExtra("username",username.getText().toString());
                startActivity(intent);
                intent.putExtra("username",username.getText().toString());
                startActivity(intent);
            }
        });

    }
    public MainActivity() {
        super();
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "MainActivity Resumed.");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity Started.");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity Stopped.");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity Destroyed.");
    }
}

