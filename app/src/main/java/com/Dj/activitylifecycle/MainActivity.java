package com.Dj.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle Activity A","onCreate invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onStart invoked",Toast.LENGTH_SHORT).show();
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ActivityTwo.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle Activity A","onStart invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onStart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle Activity A","onResume invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onResume invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle Activity A","onPause invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onPause invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle Activity A","onStop invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onStop invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle Activity A","onRestart invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onRestart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle Activity A","onDestroy invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity A==== onDestroy invoked",Toast.LENGTH_SHORT).show();
    }
}
