package vn.sefviapp.ps09105_lamvanthong_lab4.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import vn.sefviapp.ps09105_lamvanthong_lab4.R;

public class Bai3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBarBai3);
        setSupportActionBar(toolbar);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu2:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu3:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu4:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
