package com.example.rok.a0427;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rok on 2017. 4. 27..
 */

public class spinneradapter extends BaseAdapter {
    String fruit[];
    Context context;
    public spinneradapter(String fruit[],Context context){
        this.fruit = fruit;
        this.context = context;
    }
    @Override
    public int getCount() {
        return fruit.length;
    }

    @Override
    public Object getItem(int position) {
        return fruit[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
//        if(convertView ==null)
//            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item,null);
//
//        final TextView t1 = (TextView)convertView.findViewById(R.id.textView);
//        final ImageView i1 = (ImageView)convertView.findViewById(R.id.imageView);
//        final CheckBox c1 =  (CheckBox)convertView.findViewById(R.id.checkBox);
//        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(context,fruit[position],Toast.LENGTH_LONG).show();
//
//                }
//            }
//        });
//        t1.setText(fruit[position]);

        return convertView;
    }
}
