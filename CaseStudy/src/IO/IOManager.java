package IO;

import Entities.Word;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOManager{
//    List<Word> list = new ArrayList<>();

    public void writeToFile(List<Word> arrayList) {
        ObjectOutputStream outputStream;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.dat");
            outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(arrayList);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Word> readFromFile() {
        ObjectInputStream inputStream;
        try {
            FileInputStream fileInputStream = new FileInputStream("data.dat");
            inputStream = new ObjectInputStream(fileInputStream);
             List<Word> arr = (List<Word>) inputStream.readObject();
             inputStream.close();
             return arr;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
