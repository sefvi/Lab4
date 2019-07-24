package vn.sefviapp.ps09105_lamvanthong_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

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
    }

    private void initControls() {
        btnBai1 = findViewById(R.id.btnBai1);
        btnBai2 = findViewById(R.id.btnBai2);
        btnBai3 = findViewById(R.id.btnBai3);
        btnBai4 = findViewById(R.id.btnBai4);
        btnBai5 = findViewById(R.id.btnBai5);
    }
}
