package com.example.rok.a0427;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by rok on 2017. 4. 27..
 */

public class addfruit extends LinearLayout implements View.OnClickListener{
    int imageno =0;
    AutoCompleteTextView t1;
    ImageView img;
    EditText e1;
    Button b1,b2;
    fruid data;
    ArrayList<String> item;
    Fruit fruit;
    GridView g1;


    public addfruit(Context context, AttributeSet attrs) {
        super(context,attrs);

        LayoutInflater.from(context).inflate(R.layout.fruitadd,this);

        t1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        img = (ImageView)findViewById(R.id.image1);
        b1 = (Button)findViewById(R.id.b_add);
        b2   =(Button)findViewById(R.id.b_next);
        e1 = (EditText)findViewById(R.id.editText);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_add:
                if(b1.getText().toString().matches("ADD")) {


                    onAddListener.onAdd(t1.getText().toString(), fruid.imagelist[imageno], e1.getText().toString());
                }
                else{
                    onSetListener.onSet(t1.getText().toString(),fruid.imagelist[imageno],e1.getText().toString());
                }

                break;
            case R.id.b_next:
                if(imageno >6){
                    imageno = 0;

                    img.setImageResource(fruid.imagelist[imageno]);


                }
                else {
                    imageno++;
                    img.setImageResource(fruid.imagelist[imageno]);
                }

                break;
        }

    }



    interface OnAddListener{
        void onAdd(String name, int imagno, String price);

    }
    interface OnSetListener{
        void onSet(String name,int imagno,String price);
    }
    public OnSetListener onSetListener;
    public OnAddListener onAddListener;
    public void setOnSetListener(OnSetListener onSetListener){
        this.onSetListener = onSetListener;
    }

    public void setAddListener(OnAddListener onAddListener){

        this.onAddListener = onAddListener;
    }

}
