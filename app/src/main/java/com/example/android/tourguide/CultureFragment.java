package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.culture_page, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

        AttractionAdapter itemsAdapter = new AttractionAdapter(view.getContext(), attractions);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
