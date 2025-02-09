package com.map_examples;

import java.util.LinkedHashMap;

public class FindFrequentNoCh {
    // Indrajit Rajesh Rananavare

// {I=1, n=3, d=1, r=2, a=6, j=2, i=1, t=1,  =2, R=2, e=2, s=1, h=1, v=1}

    public static void main(String[] args) {
        String myName = "Indrajit Rajesh Rananavare";
        findFrequentNoOfCh(myName);
    }

    private static void findFrequentNoOfCh(String myName) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : myName.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
//                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, map.get(ch) + 1);
//                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }

}
