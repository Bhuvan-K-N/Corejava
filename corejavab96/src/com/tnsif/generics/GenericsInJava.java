package com.tnsif.generics;

import java.util.ArrayList;

public class GenericsInJava {
    public static void main(String[] args) {
    	ArrayList list = new ArrayList();
        list.add("JAVA");
        list.add(123);
        for (Object object : list) {
            String str = (String) object;
            System.out.println(str);
        }
    }
}
