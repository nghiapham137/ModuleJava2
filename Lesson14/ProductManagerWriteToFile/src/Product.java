import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private int id;
    private String productName;
    private String maker;
    private float price;
    private String description;

    public Product() {}

    public Product(int id, String productName, String maker, float price, String description) {
        this.id = id;
        this.productName = productName;
        this.maker = maker;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sản phẩm {" + "id = " + id + ", name = " + productName
                + ", nhà sản xuất = " + maker + ", giá = " + price
                + ", ghi chú: " + description + "}";
    }

    @Override
    public int compareTo(Product o) {
        return productName.compareTo(o.getProductName());
    }
}
