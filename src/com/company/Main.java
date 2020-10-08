package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int x, y;
        try {
            System.out.print("Masukan x: ");
            x = input.nextInt();
            System.out.print("Masukan y: ");
            y = input.nextInt();
            System.out.println("Hasilnya: " + x / y);
        } catch (InputMismatchException ite) {
            System.out.println("Hasilnya: java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println("Hasilnya: java.lang.ArithmeticException: / by zero");
        }
    }
}
