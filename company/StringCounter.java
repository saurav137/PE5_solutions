package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class StringCounter {

    public void solve(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of strings");
        int number=sc.nextInt();
        String[] strings=new String[number];
        Map<String,Integer> mp= new HashMap< String,Integer>();
        for(int i=0;i<number;i++){
            strings[i]=sc.next();
            Integer n = mp.get(strings[i]);
            n = (n == null) ? 1 : ++n;
            mp.put(strings[i], n);
        }
    Map<String, Boolean> finalMp= new HashMap<String, Boolean>();
        Iterator<Map.Entry<String, Integer>> it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
           // i += pair.getKey() + pair.getValue();
            if(pair.getValue()>=2){
                finalMp.put(pair.getKey(),true);
            }
            else{
                finalMp.put(pair.getKey(),false);
            }
        }
        System.out.println(Arrays.asList(finalMp));


    }



}
