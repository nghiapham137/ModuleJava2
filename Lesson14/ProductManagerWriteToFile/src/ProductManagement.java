import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements Serializable{
    List<Product> list = new ArrayList<>();

    public  void writeProductToFile() {
        ObjectOutputStream outputStream;
        try {
            File file;
            FileOutputStream fos = new FileOutputStream("output.dat");
            outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readProductFromFile() {
        ObjectInputStream inputStream;
        try {
            File file;
            FileInputStream fis = new FileInputStream("output.dat");
            inputStream = new ObjectInputStream(fis);
            ProductManagement newPm = (ProductManagement) inputStream.readObject();
            list = newPm.list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
