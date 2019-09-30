package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordCOunt {
    public void solve(){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z]+");

        Matcher m1 = p.matcher(s1);
        Map< String,Integer> hm =
                new HashMap< String,Integer>();
        while (m1.find()){
            String w=m1.group();
            Integer n = hm.get(w);
            n = (n == null) ? 1 : ++n;
            hm.put(w, n);
        }
        System.out.println(Arrays.asList(hm));
    }
}
