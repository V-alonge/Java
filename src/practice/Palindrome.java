package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a palindrome");

        String initial = input.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = initial.length() - 1; i >= 0; i--) {
            result.append(initial.charAt(i));
        }
        if (initial.equals(result.toString())) {
            System.out.printf(" %s to %s is a palindrome ", initial, result);
        } else {
            System.out.printf(" %s to %s is not a palindrome", initial, result);
        }
    }
}
