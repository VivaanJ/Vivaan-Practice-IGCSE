package PastPapersMain;

import java.util.Scanner;

public class MJ_2015_21 {

    static void takingInput(int midday[],int midnight[]){
        Scanner sc = new Scanner(System.in);
        boolean flagMid = true;
        boolean flagnight = true;

        for(int i = 0;i< midday.length;i++) {
            System.out.println("Enter the temperature at Mid-day on day" + (i + 1) + ":");
            midday[i] = sc.nextInt();
            System.out.println("Enter the temperature at Mid-night on day" + (i + 1) + ":");
            midnight[i] = sc.nextInt();
        }
    }

    public static double averageCalc(int[] x) {
        double midnightAvg = 0;
        double sum = 0;
        for (int i = 0;i<x.length;i++){
            sum += x[i];
        }
        return sum/x.length;
    }

    static void minMax(int midnight[],int midday[]){
        int min = 100;
        int max = -101;
        int coldestDay = 0;
        int hottestDay = 0;
        for (int i = 0;i< midnight.length;i++){
            if(midday[i] > max){
                max = midday[i];
                hottestDay = i;
            }
            if (midnight[i] < min ){
                min = midnight[i];
                coldestDay = i;
            }
        }
        System.out.println("The highest temperature was on day " + hottestDay + " that was: " + max + "degrees Celcius");
        System.out.println("The coldest temperature was on day " + coldestDay + " that was: " + min + "degrees Celcius");
    }

    public static void main(String[] args) {
        int midday[] = new int[5];
        int midnight[] = new int[5];
        takingInput(midday,midnight);
        System.out.println("The average temperature at mid-night was: "+averageCalc(midnight));
        System.out.println("The average temperature at mid-day was: "+averageCalc(midday));
        minMax(midnight,midday);
    }

}
