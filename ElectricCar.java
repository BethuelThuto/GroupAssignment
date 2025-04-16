public class ElectricCar extends Car {
    private Battery battery; 

    public ElectricCar(int year, String make, String model, int mileage, double price, Battery battery) {
        super(year, make, model, mileage, price);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "year=" + getYear() +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", price=" + getPrice() +
                ", batteryBrand='" + battery.getBrand() + '\'' + // Displaying battery brand
                '}';
    }
}
