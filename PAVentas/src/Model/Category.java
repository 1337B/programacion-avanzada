package Model;
import java.util.List;


public class Category {
    private Integer categoryId;
    private String name;
    private List<Product> product;

    public void addProduct(Product product) {
        this.product.add(product);
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
