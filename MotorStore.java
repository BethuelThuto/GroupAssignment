import java.util.ArrayList;

public class MotorStore {
    // Lists for vehicles
    public ArrayList<Trucks> trucks;
    public ArrayList<Car> cars;
    public ArrayList<ElectricCar> electricCars;

    // Constructor
    public MotorStore() {
        this.trucks = new ArrayList<>();
        this.cars = new ArrayList<>();
        this.electricCars = new ArrayList<>();
    }

    // Show trucks
    public void browseTrucks() {
        System.out.println("Available Trucks:");
        if (trucks.isEmpty()) {
            System.out.println("No trucks available.");
        } else {
            for (int i = 0; i < trucks.size(); i++) {
                System.out.println((i + 1) + ". " + trucks.get(i).toString());
            }
        }
    }

    // Show cars
    public void browseCars() {
        System.out.println("Available Cars:");
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).toString());
            }
        }
    }

    // Show electric cars
    public void browseElectricCars() {
        System.out.println("Available Electric Cars:");
        if (electricCars.isEmpty()) {
            System.out.println("No electric cars available.");
        } else {
            for (int i = 0; i < electricCars.size(); i++) {
                System.out.println((i + 1) + ". " + electricCars.get(i).toString());
            }
        }
    }

    // Buy truck
    public void purchaseTruck(Trucks truck) {
        if (trucks.remove(truck)) {
            System.out.println("You have purchased the truck: " + truck.toString());
        } else {
            System.out.println("Truck not found.");
        }
    }

    // Buy car
    public void purchaseCar(Car car) {
        if (cars.remove(car)) {
            System.out.println("You have purchased the car: " + car.toString());
        } else {
            System.out.println("Car not found.");
        }
    }

    // Buy electric car
    public void purchaseElectricCar(ElectricCar electricCar) {
        if (electricCars.remove(electricCar)) {
            System.out.println("You have purchased the electric car: " + electricCar.toString());
        } else {
            System.out.println("Electric car not found.");
        }
    }

    // Pawn truck
    public void pawnTruck(Trucks truck) {
        trucks.add(truck);
        System.out.println("You have pawned the truck: " + truck.toString());
    }

    // Pawn car
    public void pawnCar(Car car) {
        cars.add(car);
        System.out.println("You have pawned the car: " + car.toString());
    }

    // Pawn electric car
    public void pawnElectricCar(ElectricCar electricCar) {
        electricCars.add(electricCar);
        System.out.println("You have pawned the electric car: " + electricCar.toString());
    }

    // Sort array of cars by price (Selection sort)
    public static void sortCars(Car[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getPrice() < arr[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            // Swap cars
            Car temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
