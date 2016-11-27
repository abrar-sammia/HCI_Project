package com.example.sammiaabrar.timber_agardeningguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sho on 27/11/16.
 */

public class MyAdapter extends ArrayAdapter{

    List list = new ArrayList();

    public MyAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class FlowerData {

        ImageView flower_Picture;
        TextView name;

    }

    @Override
    public void add(Object object) {
        super.add(object);

        list.add(object);

    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        FlowerData flowerData = new FlowerData();

        if(row == null){

            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);

            flowerData.flower_Picture = (ImageView) row.findViewById(R.id.flower_Picture);
            flowerData.name = (TextView) row.findViewById(R.id.name);
            row.setTag(flowerData);

        }
        else {
            flowerData = (FlowerData) row.getTag();
        }

        FlowerProvider provider = (FlowerProvider) this.getItem(position);

        flowerData.flower_Picture.setImageResource(provider.getFlower_Picture());
        flowerData.name.setText(provider.getName());

        return row;
    }
}
