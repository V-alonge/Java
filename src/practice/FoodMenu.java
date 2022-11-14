package practice;

public class FoodMenu {
    public static void main(String[] args) {
        String[] foodList = {"Rice","Beans","Yam","Eggs","Eba","Ebiripo"};

        for (int i = 0; i < foodList.length; i++){
            System.out.println(" What do you want ? " + foodList[i]);
        }
    }
}
