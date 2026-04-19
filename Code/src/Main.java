import javax.swing.text.StyleContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Salary : ");
        int salary = Input.nextInt();


            if (salary < 1000) {
                salary = salary + 1000;
                System.out.println("You get the salary hike of 1000 : " + salary);
            } else if (salary < 2000) {
                salary = salary + 2000;
                System.out.println("You get the salary hike of 2000 : " + salary);
            } else {
                salary = salary + 3000;
                System.out.println("You get the salary hike of 3000 : " + salary);
            }
        }
    }
