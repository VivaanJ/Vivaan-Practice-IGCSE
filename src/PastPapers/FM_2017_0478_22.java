package PastPapers;

import java.util.Scanner;

public class FM_2017_0478_22 {
    static Scanner sc = new Scanner(System.in);
    static int n = 2;
    static int age [] = new int[n];
    static String house [] = new String[n];
    static double reactionTime [] = new double[n];
    static void storeData(){
        boolean validAge = false;
        boolean validHouse = false;
        boolean validReactionTime = false;

        for(int i = 0;i<n;i++){

            while(validAge == false){
            System.out.println("Enter the age of the student(12-16): ");
            int ageTemp = sc.nextInt();

            if(ageTemp >= 12 && ageTemp<=16 ) {
                age[i] = ageTemp;
                validAge = true;
                }
            }
        }

        for(int i = 0;i<n;i++){

            while(validHouse == false){
                System.out.println("Enter the house of the student('Saturn or Mars'): ");
                String houseTemp = sc.nextLine();

                if(houseTemp.equalsIgnoreCase("Saturn") || houseTemp.equalsIgnoreCase("Mars")) {
                    house[i] = houseTemp;
                    validHouse = true;
                }
            }
        }

        for(int i = 0;i<n;i++){

            while(validReactionTime == false){
                System.out.println("Enter the reaction Time of the student: ");
                double ReactionTimeTemp = sc.nextDouble();

                if(ReactionTimeTemp >= 0) {
                    reactionTime[i] = ReactionTimeTemp;
                    validReactionTime = true;
                }
            }
        }
    }

    static double saturnStats(){
        double total = 0;
        for(int i = 0;i<n;i++){
            if(house[i].equals("Saturn")){
                total = total + reactionTime[i];
            }
        }
        return total/n;
    }

    static double MarsStats(){
        double total = 0;
        for(int i = 0;i<n;i++){
            if(house[i].equals("Mars")){
                total = total + reactionTime[i];
            }
        }
        return total/n;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of students in the school: ");
        n = sc.nextInt();
        storeData();
        System.out.println("The house stats of saturn are: " + saturnStats());
        System.out.println("The house stats of mars are: " + MarsStats());
    }
}
