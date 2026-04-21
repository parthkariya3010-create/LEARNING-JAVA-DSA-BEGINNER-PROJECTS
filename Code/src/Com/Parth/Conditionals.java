package Com.Parth;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        FOR LOOP
        int n = in.nextInt();
//        for (int num = 1 ; num <= n ; num++){
//            System.out.println(num + ". Hello World ");
//        }

//        WHILE LOOP
        int num = 1;
//        while(num <= n){
//            System.out.println(num + ". Hello World ");
//            num++;
//        }
//        DO WHILE LOOP
        while (num<= n ){
            System.out.println(num + ". Hello World ");
            num++;
        }

    }
}
