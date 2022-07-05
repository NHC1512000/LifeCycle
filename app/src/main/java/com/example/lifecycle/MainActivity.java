package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intiView();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NoteActivity.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Log.d("Main activity life cycle","==On create==");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Main activity life cycle","==On start==");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Main activity life cycle","==On restart==");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Main activity life cycle","==On resume==");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Main activity life cycle","==On pause==");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Main activity life cycle","==On stop==");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Main activity life cycle","==On destroy==");
    }

    private void intiView() {

        bt1 = findViewById(R.id.note);

        bt2 = findViewById(R.id.destroy);
    }
}