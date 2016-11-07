package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        boolean sa = false;
        boolean sb = false;
        boolean sc = false;
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        sa = (a%2==0);
        sb = (b%2==0);
        sc = (c%2==0);
        boolean s1 = sa && sb || sa && sc || sb && sc;
        out.println(s1);
    }
}
