package ru.alexdev.cards;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SelectThemeActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        
        ListView listView = (ListView) findViewById(R.id.theme_list);
        
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
          "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
          "Linux", "OS/2" };
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        		  android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " выбран", Toast.LENGTH_LONG).show();
    }
}