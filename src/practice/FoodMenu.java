package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FoodMenu {
    String foodType;
    int[] foodPrice;


    public FoodMenu() {
        String[] food = {"Jollof Rice", "Beans", "Yam", "Plantain", "Zobo", "Fried Rice", "Carbonated Drinks", "Meat/beef", "Fish", "Chicken", "Turkey"};
        int[] price = {1000, 500, 1500, 600, 2000};


        foodType = Arrays.toString(food);
        foodPrice = price;

        if (foodType == food[0]) {
            System.out.println(price[0]);
        }else if(foodType == food[2]) {
            System.out.println(price[0]);
        }else if(foodType == food[5]){
            System.out.println(price[0]);
        }else if(foodType == food[1]) {
            System.out.println(food[1]);
        }

    }

    public static void main(String[] args) {

        new FoodMenu();



        System.out.println("********************* welcome to our restaurant **********************");
        System.out.println("*********************** please make your order ***********************");
        System.out.print("  Dishes");
        System.out.print("                                      (#)Prices per potion");
        System.out.println();
        System.out.println("Jollof Rice                                             1000");
        System.out.println("Beans                                                    500");
        System.out.println("Yam                                                     1000");
        System.out.println("Plantain                                                 500");
        System.out.println("Zobo                                                    1500");
        System.out.println("Fried Rice                                              1000");
        System.out.println("Carbonated Drinks                                        500");
        System.out.println("Meat/Beef                                                600");
        System.out.println("Fish                                                     500");
        System.out.println("Chicken                                                 1500");
        System.out.println("Turkey                                                  2000");
        System.out.println("*****************************Exit*************************************");


        System.out.println("Select from our menu");
        Scanner input = new Scanner(System.in);
        String foodType = input.nextLine();



    }

}