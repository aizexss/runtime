package fourteen_collections.comparator;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки");
        System.out.println(items);

        ItemPriceComparator itempricecomparator = new ItemPriceComparator();
        ItemPopularityComparator itempopularitycomparator = new ItemPopularityComparator();
        ItemStringInSensitiveNameComparator itemstringinsensitivenamecomparator = new ItemStringInSensitiveNameComparator();

        items.sort(itempricecomparator);

        System.out.println("После сортировки");
        System.out.println(items);

        items.sort(itempopularitycomparator);
        System.out.println("После сортировки популярности");
        System.out.println(items);

        items.sort(itemstringinsensitivenamecomparator);
        System.out.println("После сортировки алфавитом");
        System.out.println(items);

    }
}
