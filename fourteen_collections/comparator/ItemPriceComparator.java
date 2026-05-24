package fourteen_collections.comparator;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    @Override
//    public int compare(Item item1, Item item2) {
//        if (item1.price > item2.price) {
//            return 1;
//        } else if (item1.price < item2.price) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

//    public int compare(Item o1, Item o2) {
//        return o1.price - o2.price;
//    }

    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.price, o2.price);
    }
}
