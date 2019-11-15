package zad3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class NumbersTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ile liczb chcesz wprowadzić");
        int counter = input.nextInt();
        input.nextLine();
        Queue<Integer> numbers = new PriorityQueue<>();

        for (int i = 0; i < counter; i++) {
            numbers.offer(input.nextInt());
            input.nextLine();
        }

        while(numbers.peek() != null){
            System.out.println(Math.pow(numbers.poll(), 2));
        }

    }
}
