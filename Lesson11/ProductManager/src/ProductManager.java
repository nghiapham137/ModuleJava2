import java.util.*;

public class ProductManager implements Iservice{
    List<Product> products = new ArrayList<>();

    public void add(Object o) {
        Product c = (Product) o;
        products.add(c);
        Collections.sort(products);
    }

    public void update(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên mới:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá mới");
        float price = Float.parseFloat(scanner.nextLine());
        for (Product product : products) {
            if (id == product.getId()){
                product.setName(name);
                product.setPrice(price);
            }
                 }
    }

    public void getAll() {
        for (Product c : products) {
            System.out.println(c.toString());
        }
    }

    public void delete(int id) {
        Product c = new Product();
        for (Product product : products) {
            if (id == product.getId()) {
                c = product;
            }
        }
        products.remove(c);
    }


}
