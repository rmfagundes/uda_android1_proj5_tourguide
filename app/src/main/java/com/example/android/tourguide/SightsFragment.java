package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.sights_page, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

        AttractionAdapter itemsAdapter = new AttractionAdapter(view.getContext(), attractions);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
