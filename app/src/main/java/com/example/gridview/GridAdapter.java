package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] gymDays;
    int[] image;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] gymDays, int[] image) {
        this.context = context;
        this.gymDays = gymDays;
        this.image = image;
    }

    @Override
    public int getCount() {
       return gymDays.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView = inflater.inflate(R.layout.grid_item, null);
        }
        ImageView imageView = convertView.findViewById(R.id.imageOne);
        TextView textView = convertView.findViewById(R.id.dayOne);

        imageView.setImageResource(image[position]);
        textView.setText(gymDays[position]);

    return convertView;
    }

}
