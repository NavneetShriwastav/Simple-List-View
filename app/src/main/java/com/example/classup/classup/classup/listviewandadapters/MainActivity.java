package com.example.classup.classup.classup.listviewandadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.listView);
        ArrayList<String> items = new ArrayList<>();
        items.add("Mango");
        items.add("Lichi");
        items.add("Grapes");
        items.add("Cucumber");
        items.add("Guava");
        items.add("Orange");
        items.add("Banana");
        items.add("Apple");
        items.add("Pineapple");
        items.add("Watermelon");
        items.add("Strawberry");
        items.add("Kiwi");
        items.add("Peach");
        items.add("Papaya");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        lv.setAdapter(adapter);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the clicked item from the ArrayList
                String selectedItem = items.get(position);

                // Display a toast message showing the clicked item
                Toast.makeText(MainActivity.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });

    }

}