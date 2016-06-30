package com.example.hammerox.oxportfolio;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import ru.katso.livebutton.LiveButton;

public class AppListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            findViewById(R.id.popular_movies).setOnClickListener(customListener());
            findViewById(R.id.stock_hawk).setOnClickListener(customListener());
            findViewById(R.id.build_it_bigger).setOnClickListener(customListener());
            findViewById(R.id.make_app_material).setOnClickListener(customListener());
            findViewById(R.id.go_ubiquitous).setOnClickListener(customListener());
            findViewById(R.id.capstone).setOnClickListener(customListener());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public View.OnClickListener customListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LiveButton btn = (LiveButton) v;
                Toast.makeText(AppListActivity.this, btn.getText(), Toast.LENGTH_LONG).show();

                int id = v.getId();
                switch (id) {
                    case R.id.popular_movies:

                        break;
                    case R.id.stock_hawk:

                        break;
                    case R.id.build_it_bigger:

                        break;
                    case R.id.make_app_material:

                        break;
                    case R.id.go_ubiquitous:

                        break;
                    case R.id.capstone:

                        break;
                }
            }
        };
    }
}
