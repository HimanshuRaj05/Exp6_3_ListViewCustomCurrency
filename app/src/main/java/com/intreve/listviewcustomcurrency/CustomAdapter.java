package com.intreve.listviewcustomcurrency;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] data;

    private String[] currency;
    private int[] images;

    public CustomAdapter(Context context, String[] data,String[] currency, int[] images) {
        this.context = context;
        this.data = data;
        this.currency=currency;
        this.images = images;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item_layout, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.textView);
        TextView textView1 = convertView.findViewById(R.id.textView1);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        textView.setText(data[position]);
        textView1.setText(currency[position]);
        imageView.setImageResource(images[position]);

        return convertView;
    }
}
