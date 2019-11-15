package demo3;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(123, "Jan Kowalski");
        map.put(234, "Maria Nowak");
        map.put(345, "Wojciech Abacki");

        map.put(123, "Adam Adamowski");

        System.out.println(map.size());
        String person = map.get(234);
        System.out.println(person);
    }
}
