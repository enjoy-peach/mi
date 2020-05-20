package com.new_tx.mi.Bo;


import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class index_indexBo {



    public static void main(String[] args){



        List list = new ArrayList();

        isinterface isinterface=new isinterface() {
            @Override
            public int isbig(int a, int b) {
                return a-b;
            }
        };

//int a=0,b=2;
        isinterface isinterface1=(a,b)->a-b;

        
        System.out.println(isinterface1.isbig(2,3));

    }
}

 interface isinterface{

    int isbig(int a,int b);


}
