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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Employee> list;
            try {
                list = (List<Employee>) objectInputStream.readObject();
            } catch (Exception e) {
                list = new ArrayList<>();
            }
            objectInputStream.close();
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
