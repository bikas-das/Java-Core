package com.pkg.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_1 {
    public static void main(String[] args)  {

        exceptionTest();

    }

    public static void exceptionTest() {

        String[] fruits = {"apple", "banana", "orange"};
        try {
            System.out.println(fruits[5]);

        } catch (RuntimeException e) {
            System.out.println("exception-1: " + e.getMessage());
        }


        try {
            FileReader reader = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("exception-2: " + e.getMessage());

        }


        try {

            int a = 10;
            int res = a / 0;

        } catch (ArithmeticException e) {
            System.out.println("exception-3: " + e.getMessage());

        }

    }


}


