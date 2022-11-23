package practice;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {

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


        Scanner input = new Scanner(System.in);
        System.out.println(" please place your order");
        String order = input.nextLine();
       // StringBuilder serve = new StringBuilder();

        for (int i = order.length(); i > 0 ; i++ );{


        }  /*  int jollofrice = 1000;
    int beans = 500;
    int yam = 1000;
    int plantain = 500;
    int zobo = 1500;
    int friedrice = 1000;
    int carbonateddrinks = 500;
    int meat = 600;
    int fish = 500;
    int chicken = 1500;
    int turkey = 2000;
*/


}}