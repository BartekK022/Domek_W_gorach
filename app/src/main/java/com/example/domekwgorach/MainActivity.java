package com.example.domekwgorach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i = 0;
    public void Polub() {
        i++;
    }
    public void  usun() {
        if(i <= 0) {
        } else {
            i--;
        }
    }

}