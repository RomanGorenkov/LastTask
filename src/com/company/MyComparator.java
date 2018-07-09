package com.company;

import java.util.Comparator;

public class MyComparator implements Comparator<ChristmasToy>{
    public int compare(ChristmasToy a, ChristmasToy b){
        if(a.getSize() > b.getSize()){
            return 1;
        } else {
            return -1;
        }
    }
}
