public class Car extends Vehicle {
    private double price;
    private String model;
    protected int mileage;

    public Car(int year, String make, String model, int mileage, double price) throws InvalidPriceException {
        super(make, year);
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative.");
        }
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + getYear() +
                ", make='" + getMake() + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
