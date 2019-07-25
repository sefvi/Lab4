package vn.sefviapp.ps09105_lamvanthong_lab4.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import vn.sefviapp.ps09105_lamvanthong_lab4.R;

public class Bai4Activity extends AppCompatActivity {
    String arr[] = new String[]{"Android", "IOS", "Windows", "Mac", "Symbian OS", "Linux"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        ListView listView = findViewById(R.id.lv);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Bai4Activity.this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(arrayAdapter);

        registerForContextMenu(listView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int i = info.position;
        switch(item.getItemId()){
            case R.id.menuView:
                Toast.makeText(this, "View: " + arr[i], Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuEdit:
                Toast.makeText(this, "Edit: " + arr[i], Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuSave:
                Toast.makeText(this, "Save: " + arr[i], Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuDelete:
                Toast.makeText(this, "Delete: " + arr[i], Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onContextItemSelected(item);
    }
}
