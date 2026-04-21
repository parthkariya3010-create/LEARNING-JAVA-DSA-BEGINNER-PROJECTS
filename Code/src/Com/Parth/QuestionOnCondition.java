package Com.Parth;

import java.util.Scanner;

public class QuestionOnCondition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a  = in.nextInt();
        int b = in.nextInt();
        int c  = in.nextInt();

        int max = a;
        if (b> max ){
            max = b;
        }if (c>max){
            c= max;
        }
        System.out.println(max);

    }
}
