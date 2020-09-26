package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        seconds = seconds % 3600 % 60;
        System.out.printf("%02d", hours);
        System.out.print(":");
        System.out.printf("%02d", minutes);
        System.out.print(":");
        System.out.printf("%02d", seconds);

    }
}


