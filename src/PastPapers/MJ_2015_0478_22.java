package PastPapers;

import java.util.Scanner; // Importing the scanner for input
public class MJ_2015_0478_22 {

    static int noOfStudents = 3;
   static double weights[] = new double[noOfStudents];
   static String names[] = new String[noOfStudents];
    static Scanner sc = new Scanner(System.in); // Declaring the Scanner

    static double newWeight[] = new double[noOfStudents];
    static double diffArr[] = new double[noOfStudents];

    public static void takingInput(){
        for (int i = 0;i<noOfStudents;i++){
            System.out.println("Enter the name of Student "+(i+1)+":");
            names[i] = sc.next();
            System.out.println("Enter the weight of "+names[i]+":");
            weights[i] = sc.nextInt();
        }
    }

    public static void TermEndInput(){
        for (int i = 0;i<noOfStudents;i++){
            System.out.println("Enter the new weight at TermEnd of "+names[i]+":");
            newWeight[i] = sc.nextInt();
        }
    }

    public static void diffCal(){
        for (int i = 0;i<noOfStudents;i++){
            diffArr[i] = newWeight[i] - weights[i];
        }
    }

    public static void outputVal(){
        for(int i = 0;i<noOfStudents;i++){
            if(diffArr[i] > 2.5){
                System.out.println("The student " + names[i] + " has gained weight of " + diffArr[i] + " Kg");
            }
            else if(diffArr[i] < -2.5){
                System.out.println("The student " + names[i] + " has lost weight of " + (diffArr[i]* -1) + " Kg");
            }
        }
    }

    public static void main(String[] args) {
        takingInput();
        TermEndInput();
        diffCal();
        outputVal();
    }
}
