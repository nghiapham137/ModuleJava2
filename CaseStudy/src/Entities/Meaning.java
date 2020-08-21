package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Meaning implements Serializable {
    private String name;
    private List<Example> list;


    public Meaning(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Example> getList() {
        return list;
    }

    public void setList(List<Example> list) {
        this.list = list;
    }

    public void addExample(Example example) {
        list.add(example);
    }

    public String toString() {

        StringBuilder string = new StringBuilder("- " + name + "\n");
        for (Example example : list) {
            string.append(example.toString());
//            System.out.println();
        }
        return string.toString();
    }
}
