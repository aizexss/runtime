package fourteen_collections.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {
    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add(" ");
        list.add("World!");
        list.add("new variable");

        final Iterator<String> iterator;
        iterator = list.iterator();

        while (iterator.hasNext()) {
            final String element = iterator.next();
            System.out.println(element);
        }
    }
}
