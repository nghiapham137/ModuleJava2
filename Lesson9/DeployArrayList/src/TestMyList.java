import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,34);
        list.add(4,8);
        list.add(5,8);
        list.add(6,8);
        list.add(7,7);
        list.add(8,-2);
        list.add(9,9);
        list.add(10,5);

        MyList<Integer> clone = list.clone();




//        System.out.println(list.contains(3));
//        System.out.println(list.getSize());
        list.sprintList();
        System.out.println();
        clone.sprintList();

    }
}
