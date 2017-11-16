package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        // Create an array of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getResources().getString(R.string.atracao_igreja_senhor_do_bomfim_name),
                getResources().getString(R.string.atracao_igreja_senhor_do_bomfim_description),
                R.drawable.atracao_igreja_senhor_do_bomfim));
        attractions.add(new Attraction(getResources().getString(R.string.atracao_mercado_modelo_name),
                getResources().getString(R.string.atracao_mercado_modelo_description),
                R.drawable.atracao_mercado_modelo));
        attractions.add(new Attraction(getResources().getString(R.string.atracao_pelourinho_name),
                getResources().getString(R.string.atracao_pelourinho_description),
                R.drawable.atracao_pelourinho));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
