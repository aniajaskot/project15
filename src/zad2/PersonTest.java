package zad2;

import java.util.LinkedList;
import java.util.Queue;

public class PersonTest {
    public static void main(String[] args) {
        Queue<Person> people = new LinkedList<>();
        people.offer(new Person("Jan", "Kowalski", "0123456789"));
        people.offer(new Person("Anna", "Zawadzka", "2345678901"));
        people.offer(new Person("Wojciech", "Abacki", "3456789012"));

//        int counter = people.size();
//        for (int i = 0; i < counter; i++) {
//            System.out.println(people.peek() + " proszony do gabinetu.");
//            System.out.println(people.poll() + " obsłużony.");
//        }

        while(people.peek() != null){
            Person person = people.peek();
            System.out.println(person + " proszony do gabinetu.");
            System.out.println(people.poll() + " obsłużony.");

        }

    }
}
