package fourteen_collections.tasks.task8;

import java.util.Comparator;

public class MovieRatingThenYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        int ratingCompare = Double.compare(o2.rating, o1.rating);

        if (ratingCompare != 0) {
            return ratingCompare;
        }
        return Integer.compare(o2.year, o1.year);
    }
}
