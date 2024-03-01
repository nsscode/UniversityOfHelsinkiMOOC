public class Product {
    private double price;
    private int quantity;
    private String name;

    // Constructor
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    // Print method
    public void printProduct(){
        System.out.println(name + ", " + "price " + price + ", " + quantity + " pcs");
    }
}
