package fourteen_collections.tasks.task8;

import java.util.Comparator;

public class MovieYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o2.year, o1.year);
    }
}
