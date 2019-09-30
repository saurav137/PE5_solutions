package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class changeValuesFromMap{
    private Map<String, String> map;

    public void setMap1(Map<String, String> map1) {
        this.map = map1;
    }

    public  Map<String,String> solve(){
        Iterator keyIterator = map.keySet().iterator();
            String replace="";
            String key= (String) keyIterator.next();
            String value = map.get(key);
            if(value!=null || !value.equals(replace)){
                map.put(key,replace);

        }
        String key2= (String) keyIterator.next();
            map.put(key2,value);
            return map;
    }
    public void print(){
        System.out.println(Arrays.asList(map));
    }


}
