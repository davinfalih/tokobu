

public class product {

    private int number;
    private String name;
    private int quantity;
    private double price;

    public product() {
        number = 2;
        name = "Reborn";
        quantity = 12;
        price = 2000.00;
    }

    public product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number\t: " + number);
        System.out.println("Name\t: " + name);
        System.out.println("Quantity\t: " + quantity);
        System.out.println("Price\t: " + price);



        
     
    }
}

