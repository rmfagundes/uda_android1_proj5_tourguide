package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.restaurants_page, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

        AttractionAdapter itemsAdapter = new AttractionAdapter(view.getContext(), attractions);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
