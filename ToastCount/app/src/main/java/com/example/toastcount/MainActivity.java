package com.example.toastcount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text1);
        if(savedInstanceState != null){
            count = savedInstanceState.getInt("COUNT");
            tv.setText(String.valueOf(count));
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT",count);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Jai Hind!", Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, "Vandemataram!", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
        count++;
        //tv.setText(""+count);
        tv.setText(String.valueOf(count));
    }
}