package assignments;

import java.util.Scanner;

public class HighestAndLowestNumber {
    public void main(String[] args) {
        determine d = new determine();
        Scanner input = new Scanner(System.in);
        System.out.println("input the amount of times number should be counted");
        int counted = input.nextInt();


        System.out.println("Enter a number");
        int number = input.nextInt();

        for (int i = 1; i < counted; i++);{
            determine.largest_number(number);
            determine.smallest_number(number);

    }
}

class determine{
    public static int largest_number = 0;
    public static int smallest_number = 0;

    public static int largest_number(int number){
        if (largest_number == 0 ){
            largest_number += number;
        }
            return largest_number;
    }

    public static int smallest_number(int number){
        return number;
    }

}}



