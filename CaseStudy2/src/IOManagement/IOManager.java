package IOManagement;

import Models.Officer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOManager {
    public void writeToFile(List<Officer> arrayList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Officer.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Officer> readFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Officer.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Officer> arrayList;
            try {
                arrayList = (List<Officer>) objectInputStream.readObject();
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
