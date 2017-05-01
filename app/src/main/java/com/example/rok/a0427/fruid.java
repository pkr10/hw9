package com.example.rok.a0427;

/**
 * Created by rok on 2017. 4. 27..
 */

public class fruid {
    String name;
    int imgno;
    String price;
    int count;
    static int imagelist[] = {R.drawable.abocado,R.drawable.watermelon,R.drawable.banana,R.drawable.cherry,
            R.drawable.cranberry,R.drawable.kiwi,R.drawable.grape,R.drawable.orange};
    public fruid(String name,int imgno,String price,int count){
        this.name = name;
        this.imgno = imgno;
        this.price = price;
        this.count = count;
    }
    public void setCount(int i){
        this.count =i;
    }
}
