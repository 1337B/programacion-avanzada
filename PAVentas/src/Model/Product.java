package Model;
import Model.Category;
import java.awt.*;


public class Product {
    private int productId;
    private String name;
    private Double price;
    private final Brand brand; // Composicion con brand
    private Category category;
    private Image image;
    private int stock;

    public Product(int productId, String name, Double price, Brand brand, Category category, Image image, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.image = image;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Image getImage() {
        return image;
    }

    public int getStock() {
        return stock;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Brand getBrand() {
        return brand;
    }
}