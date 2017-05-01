package com.example.rok.a0427;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by rok on 2017. 4. 27..
 */

public class GridItem extends LinearLayout{
    TextView t1,t2;
    ImageView i1;
    public GridItem(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.grid_item,this);
         t1 = (TextView)view.findViewById(R.id.textView1);
         i1 =(ImageView)view.findViewById(R.id.imageView1);
        t2 = (TextView)view.findViewById(R.id.textView2);


    }
    public void setData(fruid one){
        t1.setText(one.name);
        i1.setImageResource(one.imgno);
        t2.setText(one.price+"원");
    }


    }

