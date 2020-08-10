import java.util.*;

public class Method {
    final static int ONE = 1;
    public static void findFrequency(String string) {
        List wordList = Arrays.asList(string.split(" +"));

        Map map = new TreeMap();
        for (Object word : wordList) {
            Integer count = (Integer) map.get(word);
            map.put(word, (count == null ? ONE : count + ONE));
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào một chuỗi");
        string = scanner.nextLine();
        findFrequency(string);
    }
}



