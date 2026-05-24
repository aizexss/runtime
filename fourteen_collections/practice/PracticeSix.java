package fourteen_collections.practice;

import java.util.ArrayList;

public class PracticeSix {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits);

        fruits.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits);
    }
}
