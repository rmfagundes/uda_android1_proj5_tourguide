package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

        // Create an array of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getResources().getString(R.string.praia_stella_maris_name),
                getResources().getString(R.string.praia_stella_maris_description),
                R.drawable.praia_stella_maris));
        attractions.add(new Attraction(getResources().getString(R.string.praia_porto_da_barra_name),
                getResources().getString(R.string.praia_porto_da_barra_description),
                R.drawable.praia_porto_da_barra));
        attractions.add(new Attraction(getResources().getString(R.string.praia_itapua_name),
                getResources().getString(R.string.praia_itapua_description),
                R.drawable.praia_itapua));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
