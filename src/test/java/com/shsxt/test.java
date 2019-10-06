package com.shsxt;

import com.shsxt.Factory.MarrayFactory;
import com.shsxt.Inter.Marray;
import com.shsxt.Proxy.JdkHandeler;
import com.shsxt.po.Me;
import com.shsxt.po.You;
import org.junit.Test;

public class test {

    @Test
    public void  test1(){
        You you = new You();
        Me me = new Me();
        JdkHandeler jdkHandeler = new JdkHandeler(me);
        Marray porxy = (Marray) jdkHandeler.getPorxy();
        porxy.toMarray();


    }
}
