package Com.Parth;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter You Second Number : ");
        int num2 = input.nextInt();

        int Sum = num1  + num2 ;
        System.out.println("TOTAl "+ num1 +" + "+ num2 +" is "+ Sum);

    }
}
