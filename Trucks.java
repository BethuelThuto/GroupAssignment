public class Trucks extends Vehicle {
    private double price;
    private String model;
    protected int mileage;

    public Trucks(int year, String make, String model, int mileage, double price) throws InvalidPriceException {
        super(make, year);
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative.");
        }
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

    public void setPrice(double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative.");
        }
        this.price = price;
    }

    public String getType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "year=" + getYear() +
                ", make='" + getMake() + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}   
