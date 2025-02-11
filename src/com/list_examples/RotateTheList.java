package com.list_examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateTheList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        Collections.reverse(numList);
        numList.forEach(System.out::println);
    }
}
