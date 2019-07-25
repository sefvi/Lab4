package vn.sefviapp.ps09105_lamvanthong_lab4.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import vn.sefviapp.ps09105_lamvanthong_lab4.R;

public class Bai5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        Button btnShow =  findViewById(R.id.btnShowPopup);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Bai5Activity.this, view);
                MenuInflater inflater = popupMenu.getMenuInflater();
                inflater.inflate(R.menu.popup, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){
                            case R.id.one:
                                Toast.makeText(Bai5Activity.this, "Chọn: " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.two:
                                Toast.makeText(Bai5Activity.this, "Chọn: " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.three:
                                Toast.makeText(Bai5Activity.this, "Chọn: " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }
}
