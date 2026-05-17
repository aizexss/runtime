package fourteen_collections.comparator;

import java.util.Comparator;

public class ItemStringInSensitiveNameComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return String.CASE_INSENSITIVE_ORDER.compare(item1.name, item2.name);
    }
}
