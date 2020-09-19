package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bt;
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.next_button);
        editText = findViewById(R.id.edit_text);
        Log.i("android state","OnCreate");
        Toast.makeText(MainActivity.this,"OnCreate", Toast.LENGTH_SHORT).show();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("android",s);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("android state","OnStart");
        Toast.makeText(MainActivity.this,"OnStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("android state","OnResume");
        Toast.makeText(MainActivity.this,"OnResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("android state","OnPause");
        Toast.makeText(MainActivity.this,"OnPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("android state","OnStop");
        Toast.makeText(MainActivity.this,"OnStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("android state","OnDestroy");
        Toast.makeText(MainActivity.this,"OnDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("android state","OnDestroy");
        Toast.makeText(MainActivity.this,"On", Toast.LENGTH_SHORT).show();

    }
}