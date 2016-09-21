package com.ahmedtikiwa.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button popularMovies;
    private Button stockHawk;
    private Button buildItBigger;
    private Button makeMaterial;
    private Button goUbiquitous;
    private Button capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIElements();
    }

    private void setupUIElements() {
        popularMovies = (Button) findViewById(R.id.popular_movies);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        makeMaterial = (Button) findViewById(R.id.make_app_material);
        goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        capstone = (Button) findViewById(R.id.capstone);
    }

    public void onClick(View view) {
        Button button = (Button) view;
        String appName = button.getText().toString();

        if (appName.equals(getString(R.string.btn_title_popular_movies))) {
            Toast.makeText(this, "This button will launch my Popular Movies app", Toast.LENGTH_SHORT).show();
        } else if (appName.equals(getString(R.string.btn_title_stock_hawk))) {
            Toast.makeText(this, "This button will launch my Stock Hawk app", Toast.LENGTH_SHORT).show();
        } else if (appName.equals(getString(R.string.btn_title_build_it_bigger))) {
            Toast.makeText(this, "This button will launch my Build it Bigger app", Toast.LENGTH_SHORT).show();
        } else if (appName.equals(getString(R.string.btn_title_make_app_material))) {
            Toast.makeText(this, "This button will launch my Make Your App Material app", Toast.LENGTH_SHORT).show();
        } else if (appName.equals(getString(R.string.btn_title_go_ubiquitous))) {
            Toast.makeText(this, "This button will launch my Go Ubiquitous app", Toast.LENGTH_SHORT).show();
        } else if (appName.equals(getString(R.string.btn_title_capstone))) {
            Toast.makeText(this, "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
        }
    }
}
