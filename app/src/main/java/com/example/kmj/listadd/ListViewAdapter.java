package com.example.kmj.listadd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    ArrayList<Data> items = new ArrayList<>();

    public ListViewAdapter(ArrayList<Data> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        TextView text1=(TextView)v.findViewById(R.id.large);
        TextView text2=(TextView)v.findViewById(R.id.small);
        text1.setText(items.get(i).getLtext());
        text2.setText(items.get(i).getStext());
        return v;
    }
}
