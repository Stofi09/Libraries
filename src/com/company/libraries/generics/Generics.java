package com.company.libraries.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Generics {

    public static <E> void initList(List<E> list){
            if(list == null){
                list = new ArrayList<>();
            }
    }
    public static <K,V> void initHash(HashMap<K,V> map){
            if(map == null){
                map = new HashMap<>();
            }
    }
}
