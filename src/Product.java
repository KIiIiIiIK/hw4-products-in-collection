enum Category {
    MILK,
    WINE,
    COFFEE
}

public class Product {

    String name;
    Double price;
    String description;
    Category category;

    Product(String name, Double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public Category getCategory() {return category;}
    public Double getPrice() {return price;}
    public String getName() {return name;}

    public String toString() {
        return name + price + description + category;}
}
