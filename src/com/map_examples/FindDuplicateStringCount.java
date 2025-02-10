package com.map_examples;

import java.util.LinkedHashMap;

public class FindDuplicateStringCount {
    public static void main(String[] args) {
        String name = "ram jay jay ram siya ram";
        findDuplicateStringCount(name);
    }

    private static void findDuplicateStringCount(String name) {
        LinkedHashMap<String, Integer> stringAndCount = new LinkedHashMap<>();
        for (String word : name.split(" ")) {
            int i = stringAndCount.getOrDefault(word, 0);
            stringAndCount.put(word, i + 1);
        }
        System.out.println(stringAndCount);

        stringAndCount.forEach((k, v) -> {
            System.out.printf("Name is %s and duplication count is %s%n", k, v);
        });

    }
}
