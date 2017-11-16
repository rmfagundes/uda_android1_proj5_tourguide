package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);

        // Create an array of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getResources().getString(R.string.cultura_carnaval_name),
                getResources().getString(R.string.cultura_carnaval_description),
                R.drawable.cultura_carnaval));
        attractions.add(new Attraction(getResources().getString(R.string.cultura_iemanja_name),
                getResources().getString(R.string.cultura_iemanja_description),
                R.drawable.cultura_iemanja));
        attractions.add(new Attraction(getResources().getString(R.string.cultura_lavagem_bomfim_name),
                getResources().getString(R.string.cultura_lavagem_bomfim_description),
                R.drawable.cultura_lavagem_bomfim));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
