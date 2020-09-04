package Models;

import java.util.Comparator;

public class FullTimeEmployeeComparator implements Comparator<FullTimeEmployee> {
    @Override
    public int compare(FullTimeEmployee o1, FullTimeEmployee o2) {
        if (o1.getSalary() > o2.getSalary() ) return 1;
        else if (o1.getSalary() == o2.getSalary()) return 0;
        else return -1;
    }
}
