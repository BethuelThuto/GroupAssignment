import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);
        MotorStore motorStore = new MotorStore(); // Assuming MotorStore is a defined class

        do {
            System.out.println("1. Browse cars");
            System.out.println("2. Browse Trucks");
            System.out.println("3. Browse Electric cars");
            System.out.println("4. Purchase a car");
            System.out.println("5. Purchase a truck");
            System.out.println("6. Purchase an electric car");
            System.out.println("7. Pawn a car");
            System.out.println("8. Pawn a truck");
            System.out.println("9. Exit");

            System.out.println("Enter your choice (1-9):");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    motorStore.browseCars();
                    break;
                case 2:
                    motorStore.browseTrucks();
                    break;
                case 3:
                    motorStore.browseElectricCars();
                    break;
                case 4:
                    motorStore.browseCars();
                    System.out.println("Select a car to purchase: ");
                    int carIndex = in.nextInt();
                    if (carIndex > 0 && carIndex <= motorStore.getCars().size()) {
                        motorStore.purchaseCar(motorStore.getCars().get(carIndex - 1));
                    } else {
                        System.out.println("Invalid car selection.");
                    }
                    break;
                case 5:
                    motorStore.browseTrucks();
                    System.out.println("Select a truck to purchase: ");
                    int truckIndex = in.nextInt();
                    if (truckIndex > 0 && truckIndex <= motorStore.getTrucks().size()) {
                        motorStore.purchaseTruck(motorStore.getTrucks().get(truckIndex - 1));
                    } else {
                        System.out.println("Invalid truck selection.");
                    }
                    break;
                case 6:
                    motorStore.browseElectricCars();
                    System.out.println("Select an electric car to purchase: ");
                    int electricCarIndex = in.nextInt();
                    if (electricCarIndex > 0 && electricCarIndex <= motorStore.getElectricCars().size()) {
                        motorStore.purchaseElectricCar(motorStore.getElectricCars().get(electricCarIndex - 1));
                    } else {
                        System.out.println("Invalid electric car selection.");
                    }
                    break;
                case 7:
                    System.out.println("Enter car details");
                    System.out.println("Enter year:");
                    int yearCar = in.nextInt();
                    System.out.println("Enter car's make:");
                    String makeCar = in.next();
                    System.out.println("Enter car's model:");
                    String modelCar = in.next();
                    System.out.println("Enter car's mileage:");
                    int mileageCar = in.nextInt();
                    System.out.println("Enter car's price:");
                    double priceCar = in.nextDouble();
                    motorStore.pawnCar(new Car(yearCar, makeCar, modelCar, mileageCar, priceCar));
                    System.out.println("Car successfully pawned!");
                    break;
                case 8:
                    System.out.println("Enter truck details");
                    System.out.println("Enter year:");
                    int yearTruck = in.nextInt();
                    System.out.println("Enter truck's make:");
                    String makeTruck = in.next();
                    System.out.println("Enter truck's model:");
                    String modelTruck = in.next();
                    System.out.println("Enter truck's mileage:");
                    int mileageTruck = in.nextInt();
                    System.out.println("Enter truck's price:");
                    double priceTruck = in.nextDouble();
                    motorStore.pawnTruck(new Trucks(yearTruck, makeTruck, modelTruck, mileageTruck, priceTruck));
                    System.out.println("Truck successfully pawned!");
                    break;
                case 9:
                    System.out.println("Thank you for visiting");
                    break;
                } } } }
