package PastPapersMain;

import java.util.Scanner;
public class ON_2020_23 {
    static Scanner kb = new Scanner(System.in);

    static int[] size_Totals = new int[2];
    static int[] bread_Totals = new int[3];
    static int[] filling_Totals = new int[6];
    static int baguettes = 0;

    public static void code() {
        boolean exit = false;
        while (exit == false) {
            boolean modify = true;
            while (modify) {
                System.out.println("Choose bread size: ");
                System.out.println("1. 15cm");
                System.out.println("2. 30cm");
                System.out.println("Enter 1 or 2: ");
                int size = kb.nextInt();
                while (size != 1 && size != 2) {
                    System.out.println("Enter valid number(1 or 2): ");
                    size = kb.nextInt();
                }
                int bread = 0;
                boolean notValid = true;
                while (notValid) {
                    System.out.println();
                    System.out.println("Choose bread");
                    System.out.println("1. Seeded");
                    System.out.println("2. White");
                    System.out.println("3. Brown");
                    System.out.println("Enter: ");
                    bread = kb.nextInt();
                    if (4 > bread && bread > 0) {
                        notValid = false;
                    }
                }
                System.out.println();
                System.out.println("Choose filling");
                System.out.println("1.Beef");
                System.out.println("2.Chicken");
                System.out.println("3.Cheese");
                System.out.println("4.Egg");
                System.out.println("5.Tuna");
                System.out.println("6.Turkey");
                System.out.println("Enter: ");
                int filling = kb.nextInt();
                if (filling <= 0 && filling >= 7) {
                    System.out.println("Enter valid: ");
                    filling = kb.nextInt();
                }
                int salads[] = new int[3];
                System.out.println();
                System.out.println("Choose salads");
                System.out.println("1.Lettuce");
                System.out.println("2.Tomato");
                System.out.println("3.SweetCorn");
                System.out.println("4.Cucumber");
                System.out.println("5.Peppers");
                for (int i = 0; i < salads.length; i++) {
                    while (true) {
                        System.out.println("Enter Salad " + (i + 1) + ":");
                        salads[i] = kb.nextInt();
                        if (salads[i] < 7 && salads[i] > 0) {
                            break;
                        }
                    }
                }

                int OrderId;
                System.out.println();
                System.out.println("1. Confirm Order");
                System.out.println("2. Modify Order");
                System.out.println("3. Exit");
                System.out.println("Enter: ");
                int status = kb.nextInt();
                switch (status) {
                    case 1:
                        baguettes++;
                        OrderId = (int) (Math.random() * 10000);
                        System.out.println("Your Order ID is: " + OrderId);
                        modify = false;
                        System.out.println("More order? : ");
                        int moreOrder = kb.nextInt();
                        if (moreOrder == 0) {
                            exit = true;
                        }
                        break;
                    case 2:
                        modify = true;
                        break;
                    case 3:
                        modify = false;
                        exit = true;
                        break;
                }
                switch (bread) {
                    case 1:
                        bread_Totals[0]++;
                        break;
                    case 2:
                        bread_Totals[1]++;
                        break;
                    case 3:
                        bread_Totals[2]++;
                        break;
                }

                filling_Totals[filling - 1] = filling_Totals[filling - 1] + 1;

            }
        }
    }
    public static void highLow(){
        boolean swap = true; // Declaring a variable swap and initializing it to true!
        while(swap){ // Loop will run till swap is true
            swap = false; // Swap is false at the start of each iteration of while loop
            for (int i = 0;i< filling_Totals.length-1;i++){
                if(filling_Totals[i] < filling_Totals[i+1] ){ // It will chech for each array value if its next value is smaller than the number or not
                    int temp = filling_Totals[i]; // If the next number is smaller then we do the swap algorithm
                    filling_Totals[i] = filling_Totals[i+1];
                    filling_Totals[i+1] = temp;
                    swap = true; // and swap will become true
                }
            }
        }

            for (int i = 0; i < filling_Totals.length; i++){
                System.out.print(filling_Totals[i] + " ");
            }

            double highestPercent = ((filling_Totals[0]/baguettes)*100);
            double lowestPercent = ((filling_Totals[filling_Totals.length-1]/baguettes)*100);
            System.out.println("The filling chosen most today was ordered " + highestPercent + " % of the times");
            System.out.println("The filling chosen least today was ordered " + lowestPercent + " % of the times");
        }

    public static void main(String[] args) {
        code();
        highLow();
    }
    }
