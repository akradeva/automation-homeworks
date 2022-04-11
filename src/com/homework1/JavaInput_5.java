package com.homework1;

import java.util.Scanner;

public class JavaInput_5 {
    // refine task 2
    public static void JavaInputTrianglePerimeter () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side a: ");
        double a = input.nextDouble();
        System.out.println("Enter Side b: ");
        double b = input.nextDouble();
        System.out.println("Enter Side c: ");
        double c = input.nextDouble();
        double p = a + b +c;
        System.out.println("The perimeter of the triangle is: " + p);
    }

    // refine task 3
    public static void JavaInputTriangleArea () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side a: ");
        double a = input.nextDouble();
        System.out.println("Enter Side b: ");
        double b = input.nextDouble();
        double area = a * b;
        System.out.println("The area of the triangle is: " + area);
    }
}
