package PastPapersMain;

import java.util.Scanner;

public class MJ_2018_22 {
    static Scanner kb = new Scanner(System.in);
    static final int herdSize = 2;
    static int cowID[] = new int[herdSize];
    static double[][] yield1 = new double[2][7];
    static double[][] yield2 = new double[2][7];

    public static void recording(){
        for (int i = 0; i < herdSize; i++) {
            System.out.println("Enter the ID of cow " + (i+1));
            cowID[i] = kb.nextInt();;
        }
        for (int i = 0 ; i < herdSize ; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Enter the 1st yield of the day " + (j+1) + " for cow " +(i+1));
                yield1[i][j] = kb.nextDouble();
                System.out.println("Enter the 2nd yield of the day " + (j+1) + " for cow " +(i+1));
                yield2[i][j] = kb.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        recording();
    }
    }
