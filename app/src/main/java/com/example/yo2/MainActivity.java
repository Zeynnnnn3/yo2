package com.example.yo2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvTextChange;
    Button btnTextChange;
    Button button2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.tvTextChange = findViewById(R.id.tvTextChange);
        this.btnTextChange = findViewById(R.id.btnTextChange);
        this.btnTextChange.setOnClickListener(view  -> tvTextChange.setText("After result"));
        this.button2 = findViewById(R.id.button2);
        this.button2.setOnClickListener(view -> tvTextChange.setTextColor(Color.parseColor("#FFC0CB")));

    }


}