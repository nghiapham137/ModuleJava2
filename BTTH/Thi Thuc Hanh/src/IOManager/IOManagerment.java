package IOManager;

import Models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOManagerment implements Serializable{
    public static void writeToFile(List<Employee> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Employee.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            System.out.println("Đã lưu file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Employee> list = (List<Employee>) objectInputStream.readObject();

            objectInputStream.close();
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Không tìm thấy dữ liệu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
