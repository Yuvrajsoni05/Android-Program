package com.yuvraj.demo_contextmenu;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.ContextMenu;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.yuvraj.demo_contextmenu.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        createMenu(menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return menuChoice(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return menuChoice(item);
    }

    private void createMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "ITEM 1");
        {
            mnu1.setAlphabeticShortcut('a');
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "ITEM 2");
        {
            mnu2.setAlphabeticShortcut('b');
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "ITEM 3");
        {
            mnu3.setAlphabeticShortcut('c');
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "ITEM 4");
        {
            mnu4.setAlphabeticShortcut('d');
        }
        menu.add(0, 4, 4, "Item 5");
        menu.add(0, 5, 5, "Item 6");
    }



    private boolean menuChoice(MenuItem item) {
            switch (item.getItemId()) {
                case 0:
                    Toast.makeText(this, "You Click On Item 1", Toast.LENGTH_LONG).show();
                case 1:
                    Toast.makeText(this, "You Click On Item 2", Toast.LENGTH_LONG).show();
                case 2:
                    Toast.makeText(this, "You Click On Item 3", Toast.LENGTH_LONG).show();
                case 3:
                    Toast.makeText(this, "You Click On Item 4", Toast.LENGTH_LONG).show();

                case 4:
                    Toast.makeText(this, "You Click On Item 5", Toast.LENGTH_LONG).show();
                case 5:
                    Toast.makeText(this, "You Click On Item 6", Toast.LENGTH_LONG).show();


            }
            return false;
        }
    }
