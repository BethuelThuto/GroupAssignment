public class ElectricCar extends Car {
    protected Battery battery; 

    public ElectricCar(int year, String make, String model, int mileage, double price, String batteryBrand) throws InvalidPriceException  {
        super(year, make, model, mileage, price); // Assuming super handles InvalidPriceException
        this.battery = new Battery(batteryBrand);
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        if (battery == null) {
            throw new IllegalArgumentException("Battery cannot be null");
        }
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
