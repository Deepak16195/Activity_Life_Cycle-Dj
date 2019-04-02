package com.Dj.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d("lifecycle Activity B","onCreate invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onStart invoked",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle Activity B","onStart invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onStart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle Activity B","onResume invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onResume invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle Activity B","onPause invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onPause invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle Activity B","onStop invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onStop invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle Activity B","onRestart invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onRestart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle Activity B","onDestroy invoked");
        Toast.makeText(getApplicationContext(),"lifecycle Activity B==== onDestroy invoked",Toast.LENGTH_SHORT).show();
    }
}
