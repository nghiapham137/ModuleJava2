import java.util.*;

public class Method implements Iservices{

    public void add(ProductManagement things) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String maker = scanner.nextLine();
        System.out.println("Nhập giá: ");
        Float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập ghi chú: ");
        String description = scanner.nextLine();
        things.list.add(new Product(id,name,maker,price,description));
        Collections.sort(things.list);
    }

    public void update(ProductManagement things) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Sửa tên");
        System.out.println("2. Sửa hảng sản xuất");
        System.out.println("3. Sửa giá");
        System.out.println("4. Sửa mô tả");
        System.out.println("5. Sửa tất cả");
        System.out.println("Nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập tên mới: ");
                String productName = scanner.nextLine();
                for (Product elements : things.list) {
                    if (id == elements.getId()) {
                        elements.setProductName(productName);
                    }
                }

                break;
            case 2:
                System.out.println("Nhập hãng sản xuất mới: ");
                String maker = scanner.nextLine();
                for (Product elements : things.list) {
                    if (id == elements.getId()) {
                        elements.setMaker(maker);
                    }
                }
                break;
            case 3:
                System.out.println("Nhập giá mới: ");
                Float price = Float.parseFloat(scanner.nextLine());
                for (Product elements : things.list) {
                    if (id == elements.getId()) {
                        elements.setPrice(price);

                    }
                }
                break;
            case 4:
                System.out.println("Nhập mô tả mới: ");
                String description = scanner.nextLine();
                for (Product elements : things.list) {
                    if (id == elements.getId()) {
                        elements.setDescription(description);

                    }
                }
                break;
            case 5:
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.println("Nhập hãng sản xuất mới: ");
                String makers = scanner.nextLine();
                System.out.println("Nhập giá mới: ");
                Float prices = Float.parseFloat(scanner.nextLine());
                System.out.println("Nhập mô tả mới: ");
                String descriptions = scanner.nextLine();
                for (Product elements : things.list) {
                    if (id == elements.getId()) {
                        elements.setProductName(name);
                        elements.setMaker(makers);
                        elements.setPrice(prices);
                        elements.setDescription(descriptions);

                    }
                }
                break;
            default:
                System.out.println("Ko có chức năng này");
                break;
        }

    }

    public void show(ProductManagement things) {
        for (Product c : things.list) {
            System.out.println(c.toString());
        }
    }

    public void search(ProductManagement things) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        for (Product element : things.list) {
            if (name.equals(element.getProductName())) {
                System.out.println(element.toString());
            }
        }

    }

    public void delete(ProductManagement things) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn xóa");
        String name = scanner.nextLine();
        Product c = new Product();
        for (Product element : things.list) {
            if (name.equals(element.getProductName())){
                c = element;

            }
        }
        things.list.remove(c);
        System.out.println("Xóa thành công");
    }



}
