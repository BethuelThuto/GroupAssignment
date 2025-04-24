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

            if (choice ==1) { MotorStore.browseCars();}
            if (choice ==2) { MotorStore.browseTrucks();}
            if (choice ==3) { MotorStore.browseElectricCars();}
            if (choice ==4) { motorStore.browseCars();
                            System.out.println("Select an car to purchase: ");
                            int carIndex = scanner.nextInt();
                            if (carIndex > 0 && CarIndex <= motorStore.Car.size()){
                                motorStore.purchaseCar(motorStore.Cars.get(carIndex - 1));
                            }else {
                                System.out.println("Invalid car selection.");
                            }
              if (choice ==5) { motorStore.browseTrucks();
                            System.out.println("Select a truck  to purchase: ");
                            int TruckIndex = scanner.nextInt();
                            if (TruckIndex > 0 && TruckIndex  <= motorStore.Trucks.size()){
                                motorStore.purchaseTruck(motorStore.Trucks.get(TrucksIndex - 1));
                            }else {
                                System.out.println("Invalid electric car selection.");
                            }               
                             
            if (choice ==6) { motorStore.browseElectricCars();
                            System.out.println("Select an electric car to purchase: ");
                            int electricCarIndex = scanner.nextInt();
                            if (electricCarIndex > 0 && electricCarIndex <= motorStore.electricCar.size()){
                                motorStore.purchaseElectricCar(motorStore.electricCars.get(electricCarIndex - 1));
                            }else {
                                System.out.println("Invalid electric car selection.");
                            }
              if(choice == 7) {
                  System.out.println("Enter truck details");
                  System.out.println("Enter year");
                  int year = in.nextInt();
                  System.out.println("Enter trucks make");
                    String make = in.next();
                  System.out.println("Enter trucks model");
                  String model = in.next();
                  System.out.println("Enter trucks milleage");
                  int mileage = in.nextInt();
                  System.out.println("Enter trucks price");
                  double price = in.nextDouble();
                  motorStore.pawnTruck(new truck(year, make, model, mileage, price));
                  System.out.println("truck sucessfully pawned!");

               if(choice == 8) {
                  System.out.println("Enter car details");
                  System.out.println("Enter year");
                  int year = in.nextInt();
                  System.out.println("Enter cars  make");
                    String make = in.next();
                  System.out.println("Enter cars model");
                  String model = in.next();
                  System.out.println("Enter cars milleage");
                  int mileage = in.nextInt();
                  System.out.println("Enter cars price");
                  double price = in.nextDouble();
                  motorStore.pawnCar(new Car(year, make, model, mileage, price));
                  System.out.println("truck sucessfully pawned!");    
                  
            if(choice == 8) {
                  System.out.println("Enter Electriccar's details");
                  System.out.println("Enter year");
                  int year = in.nextInt();
                  System.out.println("Enter make");
                    String make = in.next();
                  System.out.println("Enter  model");
                  String model = in.next();
                  System.out.println("Enter milleage");
                  int mileage = in.nextInt();
                  System.out.println("Enter price");
                  double price = in.nextDouble();
                  motorStore.pawnElectricCar(new ElectricCar(year, make, model, mileage, price));
                  System.out.println("truck sucessfully pawned!"); 
            
        
         while(choice != 9);   
    }
                   if(choice = 9) { System.out.println("Thank you for visiting!");}
                       
}
