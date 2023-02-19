package PastPapersMain;

import java.util.Scanner;

public class FM_2019_22 {
    static Scanner sc = new Scanner(System.in);
    static  boolean modify = false;
    static int numberOfPizza = 0;
    static int[] countTopping = new int[6];
    static int peopleToOrder = 3;
    public static void design(){
        while( modify || peopleToOrder > numberOfPizza){
            boolean validChoice = false;
            while(!validChoice) {
                System.out.println("Enter the size of your Pizza(Small,Medium or Large): ");
                String pizzaSize = sc.next();
                if (pizzaSize.equalsIgnoreCase("Small") || pizzaSize.equalsIgnoreCase("Medium") || pizzaSize.equalsIgnoreCase("Large")) {
                    validChoice = true;
                }
            }
            boolean validbase = false;
            while(!validbase) {
                System.out.println("Enter the Choice of Base (Thin or Thick): ");
                String Base = sc.next();
                if (Base.equalsIgnoreCase("Thin") || Base.equalsIgnoreCase("Thick")) {
                    validbase = true;
                }
            }

            boolean flag = true;
            int noOfTopping = 0;
            while(flag){
                System.out.println("");
                System.out.println("1.Pepperoni");
                System.out.println("2.Chicken");
                System.out.println("3.Extra cheese");
                System.out.println("4.Mushrooms");
                System.out.println("5.Mushrooms ");
                System.out.println("6.Olives");
                System.out.println("");
                System.out.println("Enter the 3 toppings from above(1-6):");
                while(noOfTopping < 3) {
                    int choiceOfTopping = sc.nextInt();
                    switch (choiceOfTopping) {
                        case 1 -> {
                            countTopping[0] += 1;
                            flag = false;
                            noOfTopping++;
                        }
                        case 2 -> {
                            countTopping[1] += 1;
                            flag = false;
                            noOfTopping++;
                        }
                        case 3 -> {
                            countTopping[2] += 1;
                            flag = false;
                            noOfTopping++;
                        }
                        case 4 -> {
                            countTopping[3] += 1;
                            flag = false;
                            noOfTopping++;
                        }
                        case 5 -> {
                            countTopping[4] += 1;
                            flag = false;
                            noOfTopping++;
                        }
                        case 6 -> {
                            countTopping[5] += 1;
                            flag = false;
                            noOfTopping++;
                        }
                        default -> System.out.println("Enter a number from 1 - 6!");
                    }
                }
        }
            System.out.println("To exit enter 1: ");
            System.out.println("To modify enter 2: ");
            System.out.println("To confirm enter 3: ");
            int status = sc.nextInt();
            boolean invalid = true;
            while(invalid) {
                switch (status) {
                    case 1:
                        System.out.println("Exiting!");
                        invalid = false;
                        break;
                    case 2:
                        modify = true;
                        invalid = false;
                        break;
                    case 3:
                        System.out.println("Ordered!");
                        numberOfPizza++;
                        invalid = false;
                        break;
                }
            }
        }

        for (int i = 0 ; i < countTopping.length - 1; i++){
            for (int j = i ; j < countTopping.length ; j++ ){
                if(countTopping[j] > countTopping[i]){
                    int temp = countTopping[j];
                    countTopping[j] = countTopping[i];
                    countTopping[i] = temp;
                }
            }
        }

        int sumOfToppings = 0;

        for (int i = 0; i < countTopping.length; i++){
            sumOfToppings += countTopping[i];
            System.out.println(countTopping[i]);
        }

        System.out.println(sumOfToppings);
        double highestOrder = (countTopping[0]*100)/sumOfToppings;
        double lowestorder = (countTopping[5]*100)/sumOfToppings;
        System.out.println("The most popular topping was added by " + highestOrder + " % of the people" );
        System.out.println("The least popular topping was added by " + lowestorder + " % of the people" );
    }

    public static void main(String[] args){
        design();
    }
}
