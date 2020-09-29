package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean a1 = (a % 2 == 0);
        boolean b1 = (b % 2 == 0);
        boolean c1 = (c % 2 == 0);
        if ((a1 || b1 || c1) && (b1 || c1 || a1)  ) {
			System.out.println("YES");

		} else {
			System.out.println("NO"); 
		}
    }
}
