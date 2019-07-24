package vn.sefviapp.ps09105_lamvanthong_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vn.sefviapp.ps09105_lamvanthong_lab4.Activity.Bai1Activity;

public class MainActivity extends AppCompatActivity {
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControls();
        
        initEvents();
    }

    private void initEvents() {
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntents(MainActivity.this, Bai1Activity.class);
            }
        });
    }

    private void initControls() {
        btnBai1 = findViewById(R.id.btnBai1);
        btnBai2 = findViewById(R.id.btnBai2);
        btnBai3 = findViewById(R.id.btnBai3);
        btnBai4 = findViewById(R.id.btnBai4);
        btnBai5 = findViewById(R.id.btnBai5);
    }
    public void startIntents(MainActivity a, Class uri){
        Intent intent = new Intent(a, uri);
        startActivity(intent);
    }
}
