package PastPapersMain;

import java.util.Scanner;

public class MJ_2016_22 {
    static void takingInput(){
        Scanner sc = new Scanner(System.in);
        String sackType[] = new String[5];
        double sackWeight[] = new double[5];
        String sackTemp;
        for (int i = 0;i<5;i++){
            while(true) {
                System.out.println("Enter the type of sack(C,G,S): ");
                sackTemp = sc.next();
                if(sackTemp.equals("C") || sackTemp.equals("G") || sackTemp.equals("S")){
                    break;
                }
                else {
                    System.out.println("Enter only from C,G,S !!!");
                }
            }
            switch (sackTemp){
                case "C":
                    while(true) {
                        System.out.println("Enter the weight of the Cement Sack: ");
                        sackWeight[i] = sc.nextDouble();
                        if (sackWeight[i] > 24.9 && sackWeight[i] < 25.1) {
                            break;
                        }
                        else{
                            System.out.println("Invalid weight");
                        }
                    }
                    break;
                case "G":
                    while (true) {
                        System.out.println("Enter the weight of the Gravel Sack: ");
                        sackWeight[i] = sc.nextDouble();
                        if (sackWeight[i] > 49.9 && sackWeight[i] < 50.1) {
                            break;
                        }
                        else{
                            System.out.println("Invalid weight");
                        }
                    }
                    break;
                case "S":
                    while (true) {
                        System.out.println("Enter the weight of the Sand Sack: ");
                        sackWeight[i] = sc.nextDouble();
                        if (sackWeight[i] > 49.9 && sackWeight[i] < 50.1) {
                            break;
                        }
                        else{
                            System.out.println("Invalid weight");
                        }
                    }
                    break;
            }
        }
    }
    public static void main(String[] args) {
        takingInput();
    }
}
