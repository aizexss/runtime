package fourteen_collections.practice;

import java.util.List;

public class PracticeFive {
        public static void main(String[] args) {
            final String[] coffeeArray = {"Латте", "Капучино", "Эспрессо"};

            for (String c : coffeeArray) {
                System.out.print(c + ", ");
            }
            System.out.println();

            final List<String> coffeeList = List.of(coffeeArray); // тут массив должен стать списком
            System.out.println(coffeeList);
        }
    }

