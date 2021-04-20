package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
        //input.close();
        /*
        if (radius < 0) {
            System.out.println("Invalid radius entered!");
        } else {
            //area = 3.14 * radius * radius;
            area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
        */
        while (radius <= 0) {
            System.out.println("Invalid radius entered!");
        //    input = new Scanner(System.in);
            System.out.print("Enter a radius: ");
            radius = input.nextDouble();
        }
        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
