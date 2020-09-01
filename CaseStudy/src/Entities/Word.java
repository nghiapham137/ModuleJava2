package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Word implements Serializable, Comparable<Word> {
    private String name;
    private List<MeaningType> list;


    public Word(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MeaningType> getList() {
        return list;
    }

    public void setList(List<MeaningType> list) {
        this.list = list;
    }

    public void addMeaningType(MeaningType type) {
        list.add(type);
    }
    

    public String toString() {

        StringBuilder string = new StringBuilder("@ " + name + "\n");
        for (MeaningType type : list) {
            string.append(type.toString());
        }
        return string.toString();
    }

    public int compareTo(Word word) {
        return name.compareToIgnoreCase(word.getName());
    }

}
