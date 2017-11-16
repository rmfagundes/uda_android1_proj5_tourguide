package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rodrigo.mfagundes on 02/10/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(Context context, List<Attraction> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Attraction currentAttraction = getItem(position);

        ImageView attractionImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        if (currentAttraction.hasImage()) {
            attractionImageView.setImageResource(currentAttraction.getImageResourceId());
            attractionImageView.setVisibility(View.VISIBLE);
        } else {
            attractionImageView.setVisibility(View.GONE);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameTextView.setText(currentAttraction.getName());

        TextView detailTextView = (TextView) listItemView.findViewById(R.id.list_item_detail);
        detailTextView.setText(currentAttraction.getDetail());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
