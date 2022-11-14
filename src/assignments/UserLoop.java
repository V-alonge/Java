package assignments;

import java.util.Scanner;

public class UserLoop {
    static int[] num;
    static int totalNumber;


    static int largest_number (int[] arr) {
        int largest_number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num[i] > largest_number) {
                largest_number = num[i];
            }
        }
        return largest_number;

    }


    static int smallest_number(int[] arr){
        int smallest_number = 0;
        for (int i = 0; i < arr.length; i++){
            if (num[i] < smallest_number) {
                smallest_number = num[i];
            }
        }
        return smallest_number;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("please enter the amount of time's you wish to input the numbers");
        
        totalNumber = userInput.nextInt();
        num = new int[totalNumber];

        System.out.println("Enter values");
        for (int i = 0; i < totalNumber; i+=1){
            num[i] = userInput.nextInt();
        }


        System.out.println("The largest number is: "+ largest_number(num));

        System.out.println("The smallest number is: "+ smallest_number(num));
        
        /*      
        int amount = userInput.nextInt();

        System.out.println("Enter a number");
        int numbers = userInput.nextInt();


         for (int i = numbers; i < amount; i+=1)
        {System.out.println("Enter a number"); userInput.nextInt();}




        System.out.printf("the largest number is: ", Math.max(largest_number,smallest_number));




        System.out.printf("the smallest number is: ", Math.min(smallest_number, largest_number));


    }*/
}}