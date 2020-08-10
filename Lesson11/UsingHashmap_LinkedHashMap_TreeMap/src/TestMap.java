import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nghia",30);
        hashMap.put("Long",31);
        hashMap.put("Cuong",29);
        hashMap.put("Quang",28);
        hashMap.put("Khang",32);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treemap = new TreeMap<>(hashMap);
        System.out.println("Display entries in accending order of key");
        System.out.println(treemap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Nghia",30);
        linkedHashMap.put("Long",31);
        linkedHashMap.put("Cuong",29);
        linkedHashMap.put("Quang",28);
        linkedHashMap.put("Khang",32);
        System.out.println("\n The age for Quang is: " + linkedHashMap.get("Quang") );

    }
}
