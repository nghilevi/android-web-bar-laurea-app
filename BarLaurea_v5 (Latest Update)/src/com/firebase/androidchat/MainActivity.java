package com.firebase.androidchat;

import android.app.ListActivity;
import android.content.SharedPreferences;
import android.database.DataSetObserver;
import android.os.Bundle;

import android.widget.*;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.ValueEventListener;

import java.util.Random;

public class MainActivity extends ListActivity {

    // TODO: change this to your own Firebase URL
    //private static final String FIREBASE_URL = "https://android-chat.firebaseIO-demo.com";
    private static final String FIREBASE_URL = "https://barlaurea.firebaseio.com";
    

    private Firebase ref;
    private ValueEventListener connectedListener;
    private MenuItemListAdapter menuItemListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setTitle("BarLaurea Menu, Week 8, From 17/2/2014 to 21/2/2014");

        String weekString="week1";
        // Setup our Firebase ref
        ref = new Firebase(FIREBASE_URL).child(weekString);
  }

    @Override
    public void onStart() {
        super.onStart();
        // Setup our view and list adapter. Ensure it scrolls to the bottom as data changes
        final ListView listView = getListView();
        // Tell our list adapter that we only want 50 messages at a time
        menuItemListAdapter = new MenuItemListAdapter(ref.limit(50), this, R.layout.single_menu_item);
        listView.setAdapter(menuItemListAdapter);
        menuItemListAdapter.registerDataSetObserver(new DataSetObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                listView.setSelection(menuItemListAdapter.getCount() - 1);
            }
        });

        // Finally, a little indication of connection status
        connectedListener = ref.getRoot().child(".info/connected").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                boolean connected = (Boolean)dataSnapshot.getValue();
                if (connected) {
                    Toast.makeText(MainActivity.this, "Connected to Firebase", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Disconnected from Firebase", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled() {
                // No-op
            }
        });
    }

    @Override
    public void onStop() {
        super.onStop();
        ref.getRoot().child(".info/connected").removeEventListener(connectedListener);
        menuItemListAdapter.cleanup();
    }


}
