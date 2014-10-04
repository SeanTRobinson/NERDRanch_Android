package com.seanrobinson.bnr.todo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class ToDoListActivity extends Activity implements NewItemFragment.OnNewItemAddedListener {

    private ArrayAdapter<String> aa;
    private ArrayList<String> todoItems;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate your view
        setContentView(R.layout.activity_to_do_list);

        // Get references to the Fragments
        FragmentManager fm = getFragmentManager();
        ToDoListFragment todoListFragment =
                (ToDoListFragment)fm.findFragmentById(R.id.ToDoListFragment);

        // Create the array list of to do items
        todoItems = new ArrayList<String>();

        // Create the array adapter to bind the array to the ListView
        int resID = R.layout.todolist_item;
        aa = new ArrayAdapter<String>(this, resID, todoItems);

        // Bind the array adapter to the ListView.
        todoListFragment.setListAdapter(aa);
    }

    public void onNewItemAdded(String newItem) {
        todoItems.add(newItem);
        aa.notifyDataSetChanged();
    }

}