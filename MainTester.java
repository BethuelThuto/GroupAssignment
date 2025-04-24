/**
 * 
 */
import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("1.Browse cars");
            System.out.println("2.Browse Trucks");
            System.out.println("3.Browse Electric cars");
            System.out.println("4.purchase a car");
            System.out.println("5.purchase a truck");
            System.out.println("6.purchase an electric car");
            System.out.println("7.Pawn a car");
            System.out.println("8.Pawn a truck");
            System.out.println("9.Exit");

             System.out.println("Enter your choice(1-9)");
             int choice = in.nextInt();

            if (choice ==1) { MotorStore.broswerCars();}
        }
         while(choice != 9);   
    }
}
