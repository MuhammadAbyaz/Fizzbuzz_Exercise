package com.company;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte five = 5;
        final byte three = 3;
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int Number = sc.nextInt();

        //Logic
        if (Number % five ==0 && Number % three ==0)
            System.out.println("FizzBuzz");
        else if(Number % five == 0)
            System.out.println("Fizz");
        else if (Number % three == 0)
            System.out.println("Buzz");
        else
            System.out.println(Number);

    }
}
