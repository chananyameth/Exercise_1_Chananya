package com.example.exercise_1_chananya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Password = "4952";
    String UserInput = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener OnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserInput += (String)((Button)v).getText();
                ((TextView)findViewById(R.id.TextInput)).setText(UserInput);
                if (UserInput.length() == 4) {
                    if (UserInput.equals(Password))
                        Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "failure", Toast.LENGTH_SHORT).show();
                    UserInput = "";
                }
            }
        };
        ((Button)findViewById(R.id.button0)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button1)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button2)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button3)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button4)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button5)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button6)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button7)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button8)).setOnClickListener(OnClick);
        ((Button)findViewById(R.id.button9)).setOnClickListener(OnClick);
    }
}
