package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действие:");
        System.out.println("1. Объем куба");
        System.out.println("2. Объем параллелепипеда");
        System.out.println("3. Объем сферы");
        System.out.println("4. Объем конуса");
        System.out.println("5. Объем цилиндра");

        int ActNumber = sc.nextInt();
        switch (ActNumber) {
            case 1:
                float a = sc.nextInt();
                System.out.printf("Объем куба: %.2f\n", a * a * a);
                break;
            case 2:
                float z = sc.nextInt();
                float x = sc.nextInt();
                float c = sc.nextInt();
                System.out.printf("Объем параллелепипеда: %.2f\n", z * x * c);
                break;
            case 3:
                float r = sc.nextInt();
                System.out.printf("Объем сферы: %.2f\n", Math.PI*4/3*r*r*r);
                break;
            case 4:
                System.out.println("Введите радиус: ");
                float R = sc.nextInt();
                System.out.println("Введите высоту: ");
                float h = sc.nextInt();
                System.out.printf("Объем конуса: %.2f\n", 1/3*Math.PI*R*R*h);
                break;
            case 5:
                System.out.println("Введите радиус: ");
                float r1 = sc.nextInt();
                System.out.println("Введите высоту: ");
                float H = sc.nextInt();
                System.out.printf("Объем цилиндра: %.2f\n", Math.PI*r1*r1*H);
                break;
            default:
                System.out.println("Выбранно неизвестное действие");
                break;

        }

    }
}
