package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MeaningType implements Serializable {
    private String name;
    private List<Meaning> list;

    public MeaningType(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Meaning> getList() {
        return list;
    }

    public void setList(List<Meaning> list) {
        this.list = list;
    }

    public void addMeaning(Meaning meaning) {
        list.add(meaning);
    }

    public String toString() {

        StringBuilder string = new StringBuilder("*  " + name + "\n");
        for (Meaning meaning : list) {
            string.append(meaning.toString());
        }
        return string.toString();
    }
}
