package demo1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(35);
        numbers.add(41);

        numbers.remove(35);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
            if(next.equals(41)){
                iterator.remove();
            }
        }
        System.out.println(numbers.size());

    }
}
