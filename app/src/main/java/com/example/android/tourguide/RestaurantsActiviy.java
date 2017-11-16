package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_activiy);

        // Create an array of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getResources().getString(R.string.restaurante_mistura_name),
                getResources().getString(R.string.restaurante_mistura_description),
                R.drawable.restaurante_mistura));
        attractions.add(new Attraction(getResources().getString(R.string.restaurante_paraiso_tropical_name),
                getResources().getString(R.string.restaurante_paraiso_tropical_description),
                R.drawable.restaurante_paraiso_tropical));
        attractions.add(new Attraction(getResources().getString(R.string.restaurante_pobre_juan_name),
                getResources().getString(R.string.restaurante_pobre_juan_description),
                R.drawable.restaurante_pobre_juan));
        attractions.add(new Attraction(getResources().getString(R.string.restaurante_zafferano_name),
                getResources().getString(R.string.restaurante_zafferano_description),
                R.drawable.restaurante_zafferano));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
