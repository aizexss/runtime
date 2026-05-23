package fourteen_collections.tasks.task8;

import java.util.Comparator;

public class MovieTitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.title, o2.title);
    }
}
