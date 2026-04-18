package Com.Parth;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Roll No:");
        int Rollno = input.nextInt();
        input.nextLine();
        System.out.print("Enter you Name:");
        String Name = input.nextLine();
        System.out.print("Enter you Phone Number:");
        long PNumber = input.nextLong();
        System.out.print("Enter you Average CGPA:");
        float Acgpa = input.nextFloat();
        input.nextLine();
        System.out.print("Enter you Favorate subject  :");
        String Fsubject = input.nextLine();

        System.out.println("Roll no Of the student is  : " + Rollno);
        System.out.println("Name Of the student is  : " + Name);
        System.out.println("Phone NUmber Of the student is  : " + PNumber);
        System.out.println("Average CGPA Of the student is  : " + Acgpa);
        System.out.println("Favorite Subject Of the student is  : " + Fsubject);

    }
}
