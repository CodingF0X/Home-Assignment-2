public class Car {
    private int id;
    private String make;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String registration_Number;
    
    public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registration_Number) {

       setId(id);
       setMake(make);
       setModel(model);
       setYearOfManufacture(yearOfManufacture);
       setColor(color);
       setPrice(price);
       setRegistration_Number(registration_Number);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getRegistration_Number() {
        return registration_Number;
    }

    public void setRegistration_Number(String registration_Number) {
        this.registration_Number = registration_Number;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", make=" + make + ", model=" + model + ", yearOfManufacture=" + yearOfManufacture + ", color=" + color + ", price=" + price + ", registration_Number=" + registration_Number + '}';
    }



}
