package com.anu.fi;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("🔥 Functional Interface 🔥");

        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        double d = 90.89d;
        int a = 10;

        // big = small
        double dd = a;

        // small = big
       // int aa = d;
        FiDemos fi=new FiDemos();
        //fi.demo6();
        fi.demo9();
    }
}
