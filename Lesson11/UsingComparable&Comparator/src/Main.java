import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nghia",30,"HN");
        Student student1 = new Student("Long",32,"HN");
        Student student2 = new Student("Minh",19,"NA");
        Student student3 = new Student("Quang",25,"NA");

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sánh theo tuổi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
