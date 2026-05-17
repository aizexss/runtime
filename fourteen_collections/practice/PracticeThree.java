package fourteen_collections.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeThree {
    public static void main(String[] args) {
        final List<String> cats = new ArrayList<>();

        cats.add("Маркиз");
        cats.add("Принцесса");
        cats.add("Пирожок");
        cats.add("Мурка");

        cats.remove(1);
        cats.remove(2);
        cats.add(2, "Лев");
        System.out.println(cats);
    }
}
