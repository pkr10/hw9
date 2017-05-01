package com.example.rok.a0427;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rok on 2017. 4. 27..
 */

public class gridadapter extends BaseAdapter{
    ArrayList<fruid> data;
    Context context;
    public gridadapter(ArrayList<fruid> data,Context context){
        this.data = data;
        this.context = context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView ==null)
            convertView = new GridItem(context);
        ((GridItem)convertView).setData(data.get(position));
        final TextView t2 = (TextView)convertView.findViewById(R.id.textView2);
        fruid fruit  = data.get(position);
        if(fruit.count ==1){
            t2.setVisibility(View.VISIBLE);
        }
        else{
            t2.setVisibility(View.INVISIBLE);
        }


        return convertView;
    }

    public void addFruit(fruid fruid) {
        data.add(fruid);
    }
    public void setFruit(int index,fruid fruit){ data.set(index,fruit);}

    public void refresh() {
        notifyDataSetChanged();
    }
}
