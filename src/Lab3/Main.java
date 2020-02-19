package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortingUtilityIF sortedList = new SortingUtilityProxy();
        List<Product> items = new ArrayList<>();
        Product p1 = new Product(3456, "bag", 122.00);
        Product p2 = new Product(7234, "Shirt", 37.98);
        Product p3 = new Product(3471, "Pants", 65.50);
        Product p4 = new Product(6567, "Shoes", 127.09);
        Product p5 = new Product(1876, "Bling", 1723.78);
        Product p6 = new Product(2456, "Belt", 9.99);
        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);
        items.add(p6);
        System.out.println("");
        sortedList.sort(items, 1);
        System.out.println("");
        sortedList.sort(items, 2);



    }
}