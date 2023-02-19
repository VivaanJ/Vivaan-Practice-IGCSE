package PastPapersMain;

import java.lang.reflect.Member;
import java.util.Scanner;

public class ON_2022_21 {
    static int noOfMembers = 5;
    static String[] name = new String[noOfMembers];
    static int[] age = new int[noOfMembers];
    static char[] Gender = new char[noOfMembers];
    static int[] MembershipType = new int[noOfMembers];
    static boolean[] teamMember = new boolean[noOfMembers];
    static double[] annualFee = new double[noOfMembers];
    static boolean[] feePaid = new boolean[noOfMembers];
    static Scanner kb = new Scanner(System.in);
    static int[] eachMembershipCount = new int[4];
    static int[] notPaidMembership = new int[4];
    static String[] membershipName = {"Junior","Adult","Senior","Golden"};
    public static void populatingArrays(){
        for (int i = 0; i < noOfMembers; i++){
            System.out.println("Enter the name of the member: ");
            name[i] = kb.next();
            System.out.println("Enter the age of the member: ");
            age[i] = kb.nextInt();
            System.out.println("Enter the Gender of the Member (M or F): ");
            Gender[i] = kb.next().charAt(0);
            System.out.println("Is the member a team member? (true or false): ");
            teamMember[i] = kb.nextBoolean();
            System.out.println("Has the fees been paid? (true or false): ");
            feePaid[i] = kb.nextBoolean();

            if (age[i] < 18 && age[i]>=2){
                MembershipType[i] = 1;
            } else if (age[i] < 50 && age[i]>=18) {
                MembershipType[i] = 2;
            } else if (age[i] < 80 && age[i]>=50) {
                MembershipType[i] = 3;
            }
            else{
                MembershipType[i] = 4;
            }

            if (MembershipType[i] == 1) {
                if (teamMember[i]) {
                    annualFee[i] = (10 * 0.9);
                } else annualFee[i] = 10;
            } else if (MembershipType[i] == 2) {
                if (teamMember[i]) {
                    annualFee[i] = (20 * 0.9);
                } else annualFee[i] = 20;
            } else if (MembershipType[i] == 3) {
                if (teamMember[i]) {
                    annualFee[i] = (15 * 0.9);
                } else annualFee[i] = 15;
            } else if (MembershipType[i] == 4) {
                annualFee[i] = 0;
            } else {
                throw new IllegalStateException("Unexpected value: " + MembershipType);
            }
        }
    }

    public static void statistics(){
        for (int i = 0; i < noOfMembers; i++){
           int temp = MembershipType[i];
            eachMembershipCount[temp-1]++;
            if(!feePaid[i]){
                notPaidMembership[temp-1]++;
            }
        }
        for (int i = 0; i < eachMembershipCount.length;i++) {
            System.out.println((notPaidMembership[i]*100)/eachMembershipCount[i] + "% of people of the " + membershipName[i] + " Membership have not paid the fees.");
        }
        int expectedFee = 0;
        int feeReceived = 0;
        for (int i = 0; i< noOfMembers;i++){
            expectedFee += annualFee[i];
            if(feePaid[i]){
                feeReceived += annualFee[i];
            }
        }
        System.out.println("The fees expected to be received was $" + expectedFee);
        System.out.println("The fees received from members was $" + feeReceived);
    }

    public static void nextYearSetUp(){
        System.out.println("List of members that have not paid the fees:");
        for (int i = 0 ; i< noOfMembers ; i++){
            if(feePaid[i] == false){
                System.out.println(name[i]);
            }
            age[i] += 1;

            if (age[i] < 18 && age[i]>=2){
                MembershipType[i] = 1;
            } else if (age[i] < 50 && age[i]>=18) {
                MembershipType[i] = 2;
            } else if (age[i] < 80 && age[i]>=50) {
                MembershipType[i] = 3;
            }
            else{
                MembershipType[i] = 4;
            }

            if (MembershipType[i] == 1) {
                if (teamMember[i]) {
                    annualFee[i] = (10 * 0.9);
                } else annualFee[i] = 10;
            } else if (MembershipType[i] == 2) {
                if (teamMember[i]) {
                    annualFee[i] = (20 * 0.9);
                } else annualFee[i] = 20;
            } else if (MembershipType[i] == 3) {
                if (teamMember[i]) {
                    annualFee[i] = (15 * 0.9);
                } else annualFee[i] = 15;
            } else if (MembershipType[i] == 4) {
                annualFee[i] = 0;
            } else {
                throw new IllegalStateException("Unexpected value: " + MembershipType);
            }

            feePaid[i] = false;
        }
        System.out.println("The list of current Team members of Junior membership are: ");
        for (int i = 0 ; i < noOfMembers ; i++){
            if(teamMember[i] && MembershipType[i] == 1){
                System.out.println(name[i]);
            }
        }
        System.out.println("The list of current Team members of Adult membership are: ");
        for (int i = 0 ; i < noOfMembers ; i++){
            if(teamMember[i] && MembershipType[i] == 2){
                System.out.println(name[i]);
            }
        }
        System.out.println("The list of current Team members of Senior membership are: ");
        for (int i = 0 ; i < noOfMembers ; i++){
            if(teamMember[i] && MembershipType[i] == 3){
                System.out.println(name[i]);
            }
        }
        System.out.println("The list of current Team members of Golden membership are: ");
        for (int i = 0 ; i < noOfMembers ; i++){
            if(teamMember[i] && MembershipType[i] == 4){
                System.out.println(name[i]);
            }
        }
    }

    public static void main(String[] args){
        populatingArrays();
        statistics();
        nextYearSetUp();
    }
}
