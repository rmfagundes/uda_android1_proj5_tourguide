package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.beaches_page, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

        AttractionAdapter itemsAdapter = new AttractionAdapter(view.getContext(), attractions);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
