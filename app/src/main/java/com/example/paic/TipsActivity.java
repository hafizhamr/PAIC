package com.example.paic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipsActivity extends AppCompatActivity {

    private Button Age13, Age46, Age79;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        Age13 = (Button)findViewById(R.id.age13);
        Age13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipsActivity.this, Tips13Activity.class));
            }
        });

        Age46 = (Button)findViewById(R.id.age46);
        Age46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipsActivity.this, Tips46Activity.class));
            }
        });

        Age79 = (Button)findViewById(R.id.age79);
        Age79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipsActivity.this, Tips79Activity.class));
            }
        });

    }
}
