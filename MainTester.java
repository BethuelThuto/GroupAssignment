/**
 * 
 */
import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);
        
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
             choice = in.nextInt();

            if (choice ==1) { MotorStore.browseCars();}
            if (choice ==2) { MotorStore.browseTrucks();}
            if (choice ==3) { MotorStore.browseElectricCars();}
            if (choice ==4) { MotorStore.browseCars();
                            System.out.println("Select an car to purchase: ");
                            int carIndex = in.nextInt();
                            if (carIndex > 0 && carIndex <= MotorStore.Car.size()){
                                MotorStore.purchaseCar(MotorStore.Car.get(carIndex - 1));
                            }else {
                                System.out.println("Invalid car selection.");
                            }}
              if (choice ==5) { MotorStore.browseTrucks();
                            System.out.println("Select a truck  to purchase: ");
                            int TruckIndex = in.nextInt();
                            if (TruckIndex > 0 && TruckIndex  <= MotorStore.Trucks.size()){
                                MotorStore.purchaseTruck(MotorStore.Trucks.get(TruckIndex - 1));
                            }else {
                                System.out.println("Invalid electric car selection.");
                            }    }           
                             
            if (choice ==6) { MotorStore.browseElectricCars();
                            System.out.println("Select an electric car to purchase: ");
                            int electricCarIndex = in.nextInt();
                            if (electricCarIndex > 0 && electricCarIndex <= MotorStore.ElectricCar.size()){
                                MotorStore.purchaseElectricCar(MotorStore.electricCars.get(electricCarIndex - 1));
                            }else {
                                System.out.println("Invalid electric car selection.");
                            }}
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
                  MotorStore.pawnTruck(new Trucks(year, make, model, mileage, price));
                  System.out.println("truck sucessfully pawned!");
              }
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
                  MotorStore.pawnCar(new Car(year, make, model, mileage, price));
                  System.out.println("truck sucessfully pawned!");    
               }
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
                  System.out.println("Enter battery");
                  String battery = in.next();
                  MotorStore.pawnElectricCar(new ElectricCar(year, make, model, mileage, price, battery));
                  System.out.println("truck sucessfully pawned!");     
            }
    } while(choice != 9);
                   if(choice == 9) { System.out.println("Thank you for visiting!");}
}
}                   

            