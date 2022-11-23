package practice;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        for (int i = 0; counter <= 10; counter++) {
            if (counter == 1) {
                System.out.println("Enter the " + counter + "st grade");
            }
            else if(counter == 2) {
                System.out.println("Enter the " + counter + "nd grade");
            }
            else if (counter == 3){
                System.out.println("Enter the " + counter + "rd grade");
            }
            else{
                System.out.println("Enter the " + counter + "th grade");
            }
            input.nextInt();
            }
        }
    }
