public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
//        System.out.println(list.contains(3));
        System.out.println(list.getSize());


    }
}
