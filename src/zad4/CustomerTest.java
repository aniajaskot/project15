package zad4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CustomerTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("customers.csv")))) {
            Map<Integer, Customer> customerMap = getCustomers(br);
            System.out.println(customerMap.keySet());
            printMapValues(customerMap);
            printCustomer(customerMap);
        } catch (IOException | InputMismatchException ex){
            System.err.println(ex);
        }
    }

    private static void printCustomer(Map<Integer, Customer> customerMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id");
        int indeks = scanner.nextInt();
        if(customerMap.containsKey(indeks)){
            System.out.println(customerMap.get(indeks));
        } else {
            System.out.println("Klient nie istnieje");
        }
    }

    private static void printMapValues(Map<Integer, Customer> customerMap) {
        for (Integer key : customerMap.keySet()){
            System.out.println(customerMap.get(key));
        }
        System.out.println("================================");

        for (Customer customer: customerMap.values()) {
            System.out.println(customer);
        }
        System.out.println("=================================");

        for(Map.Entry<Integer, Customer>  entry : customerMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    private static Map<Integer, Customer> getCustomers(BufferedReader br) throws IOException {
        Map<Integer, Customer> customerMap = new HashMap<>();
        String line;
        while((line = br.readLine()) != null){
            String[] customer = line.split(";");
            int id = Integer.parseInt(customer[0]);
            customerMap.put(id, new Customer(id, customer[1], customer[2], customer[3]));
        }
        return customerMap;
    }
}
