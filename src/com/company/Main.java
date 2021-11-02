package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Type in a number: " +
                        "");
                int num = input.nextInt();
                System.out.println(10/num);
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Number too long " +e);
                input.next();
            } catch (ArithmeticException e) {
                System.out.println("You should not divide a number by zero " +e);
                input.next();
            } catch (Exception e) {
                System.out.println("Exception occurred" +e);
                input.next();
            }
        }
    }
}
