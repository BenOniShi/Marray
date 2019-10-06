package com.shsxt.Factory;

import com.shsxt.Inter.Marray;

public class MarrayFactory implements Marray {


    private Marray tatig;


    public MarrayFactory(Marray tatig) {
        before();
        this.tatig = tatig;
        after();
    }

    public void before(){
        System.out.println("马上要结婚了");
    }

    @Override
    public void toMarray() {
        tatig.toMarray();
    }


    public void after(){
        System.out.println("入洞房拉");
    }
}
