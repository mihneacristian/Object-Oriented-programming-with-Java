package Week4;

class Product {
    private String name;
    private double price;
    private int amount;


    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}

public class Exercise73 {
    public static void main(String[] args) {
        //Exercise 73: Product

        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }
}
