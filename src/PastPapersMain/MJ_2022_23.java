package PastPapersMain;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MJ_2022_23 {
    static boolean[][] booking = new boolean[3][7];
    static String[][] names = new String[3][7];
    static int[][] bookingCode = new int[3][7];
    static int[][] cost = new int[3][7];
    static String tempName;
    static Scanner sc = new Scanner(System.in);
    static int roomNo;
    static int date;
    static boolean more = true;
    static String[] DOW = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    static String[] RoomName = {"Large Room", "Small Room 1", "Small Room 2"};
    public static void task2() {
        for (boolean[] booleans : booking) {
            Arrays.fill(booleans, false);
        }
        while(more){
            System.out.println("Enter your name: ");
            tempName = sc.next();
            System.out.println("1. Large Room ($295)");
            System.out.println("2. Small Room 1 ($175)");
            System.out.println("3. Small Room 2 ($150)");
            System.out.println("Enter the room you want: ");
            roomNo = sc.nextInt();
            System.out.println("Enter the day on which you want the booking (1-7):  ");
            date = sc.nextInt();

            if (!booking[roomNo - 1][date - 1]) {
                System.out.println("The details of the booking are: ");
                switch (roomNo) {
                    case 1 -> {
                        System.out.println("The cost is: $ 295 ");
                        switch (date) {
                            case 1 -> System.out.println("Large room on Monday");
                            case 2 -> System.out.println("Large room on Tuesday");
                            case 3 -> System.out.println("Large room on Wednesday");
                            case 4 -> System.out.println("Large room on Thursday");
                            case 5 -> System.out.println("Large room on Friday");
                            case 6 -> System.out.println("Large room on Saturday");
                            case 7 -> System.out.println("Large room on Sunday");
                        }
                    }
                    case 2 -> {
                        System.out.println("The cost is: $ 175 ");
                        switch (date) {
                            case 1 -> System.out.println("Small room 1 on Monday");
                            case 2 -> System.out.println("Small room 1 on Tuesday");
                            case 3 -> System.out.println("Small room 1 on Wednesday");
                            case 4 -> System.out.println("Small room 1 on Thursday");
                            case 5 -> System.out.println("Small room 1 on Friday");
                            case 6 -> System.out.println("Small room 1 on Saturday");
                            case 7 -> System.out.println("Small room 1 on Sunday");
                        }
                    }
                    case 3 -> {
                        System.out.println("The cost is: $ 150 ");
                        switch (date) {
                            case 1 -> System.out.println("Small room 2 on Monday");
                            case 2 -> System.out.println("Small room 2 on Tuesday");
                            case 3 -> System.out.println("Small room 2 on Wednesday");
                            case 4 -> System.out.println("Small room 2 on Thursday");
                            case 5 -> System.out.println("Small room 2 on Friday");
                            case 6 -> System.out.println("Small room 2 on Saturday");
                            case 7 -> System.out.println("Small room 2 on Sunday");
                        }
                    }
                }
                System.out.println("Do you want to confirm? (true or false) ");
                boolean confirm = sc.nextBoolean();

                if (confirm) {
                    System.out.println("Booked");
                    booking[roomNo - 1][date - 1] = true;
                    names[roomNo - 1][date - 1] = tempName;
                    switch (roomNo) {
                        case 1 -> cost[roomNo - 1][date - 1] = 295;
                        case 2 -> cost[roomNo - 1][date - 1] = 175;
                        case 3 -> cost[roomNo - 1][date - 1] = 150;
                    }
                    Random rd = new Random(); // creating Random object
                    bookingCode[roomNo - 1][date - 1] = rd.nextInt();
                }
            }
            else{
                System.out.println("Booking not available");
            }
            System.out.println("Do you want to make any more bookings?");
            System.out.println("1. No");
            System.out.println("Any other Number =  Yes");
            int temp = sc.nextInt();
            more = temp != 1;
        }
    }

    public static void task3(){
        System.out.println("Enter the meeting room for which you want to see the availability(1,2 or 3): ");
        int roomCheck = sc.nextInt();
        for (int i = 0; i < 7;i++){
            if(!booking[roomCheck - 1][i]) {
                System.out.println("Available On " + DOW[i]);
            }
        }

        int total = 0;
        for (int row = 0; row < cost.length; row++){
            for (int col = 0; col < cost[row].length; col++){
                total += cost[row][col];
            }
        }
        System.out.println("The total amount of money taken till now is: $" +total);

        System.out.println("Enter the name of the client: ");
        String client_name = sc.next();
        for (int row = 0; row < 7; row++){
            for (int col = 0; col < 3; col++){
                if(client_name.equals(names[col][row])){
                    System.out.println("The client has a booking on " + DOW[row] + " of " + RoomName[col] );
                }
            }
        }

    }

    public static void main(String[] args) {
        task2();
        task3();
    }
}
