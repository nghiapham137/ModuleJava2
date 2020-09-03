package IOManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOManagement {
    public void writeToFile(List<Object> arrayList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Object> readFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Officer.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Object> arrayList;
            try {
                arrayList = (List<Object>) objectInputStream.readObject();
            } catch (Exception e) {
                arrayList = new ArrayList<>();
            }
            objectInputStream.close();
            return arrayList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
