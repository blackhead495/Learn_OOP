package Webinars.Webinar1;

public class Product {
    private String name;
    private double price;
    private double value;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(){

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
