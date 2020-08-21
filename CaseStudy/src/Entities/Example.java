package Entities;

import java.io.Serializable;

public class Example implements Serializable {
    private String name;

    public Example(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "= " + name + "\n";
    }
}
