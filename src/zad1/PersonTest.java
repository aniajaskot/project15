package zad1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PersonTest {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Jan", "Kowalski", 20));
        people.add(new Person("Maria", "Nowak", 25));

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj separator");
        String separator = scan.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("people.csv")))) {
            Iterator<Person> iterator = people.iterator();
            while(iterator.hasNext()){
                Person next = iterator.next();
                System.out.println(next);
                bw.write(next.toCsv(separator));
            }
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
