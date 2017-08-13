package com.example.login.ojassloginsignup.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.adapter.FoldingCellListAdapter;
import com.example.login.ojassloginsignup.model.Item;
import com.ramotion.foldingcell.FoldingCell;


import java.util.ArrayList;

/**
 * Example of using Folding Cell with ListView and ListAdapter
 */
public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        // get our list view
        ListView theListView = (ListView) findViewById(R.id.mainListView);

        // prepare elements to display
        final ArrayList<Item> items = Item.getTestingList();

        for(int i=0;i<5;i++) {
            // add custom btn handler to first list item
            items.get(i).setRequestBtnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
            items.get(i).setRequestBtnClickListener2(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR SECOND BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
            items.get(i).setRequestBtnClickListener3(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR THIRD BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
            items.get(i).setRequestBtnClickListener4(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR FOURTH BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
            items.get(i).setRequestBtnClickListener5(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR FIFTH BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
            items.get(i).setRequestBtnClickListener6(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR SIXTH BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
            items.get(i).setRequestBtnClickListener7(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR SEVENTH BUTTON", Toast.LENGTH_SHORT).show();
                }
            });
        }
        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)
        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(this, items);

        // add default btn handler for each request btn on each item if custom handler not found
        adapter.setDefaultRequestBtnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DEFAULT HANDLER FOR ALL BUTTONS", Toast.LENGTH_SHORT).show();
            }
        });

        // set elements to adapter
        theListView.setAdapter(adapter);

        // set on click event listener to list view
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                // toggle clicked cell state
                ((FoldingCell) view).toggle(false);
                // register in adapter that state for selected cell is toggled
                adapter.registerToggle(pos);
            }
        });

    }
}
