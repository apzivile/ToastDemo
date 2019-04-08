package com.zivile.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction(View view){
        EditText nameText = findViewById(R.id.nameText);
        Toast.makeText(this, "Hello there , " + nameText.getText().toString() + " !", Toast.LENGTH_SHORT).show();
        Log.i("Info", nameText.getText().toString());
    }
}
