package fourteen_collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeSeven {
//    public static void main(String[] args) {
//        List<Long> listOfLongs = new ArrayList<>();
//        listOfLongs.add(157478403L);
//        listOfLongs.add(2450033L);
//        listOfLongs.add(32039458858604L);
//
//        System.out.println(listOfLongs);
//
//        Collections.fill(listOfLongs, 55555555L);
//        System.out.println(listOfLongs);
//    }

    public static void main(String[] args) {
        List<Long> listOfSmallLongs = new ArrayList<>();
        listOfSmallLongs.add(1L);
        listOfSmallLongs.add(2L);
        listOfSmallLongs.add(3L);

        List<Long> listOfBigLongs = new ArrayList<>();
        listOfBigLongs.add(10000000L);
        listOfBigLongs.add(20000000L);
        listOfBigLongs.add(30000000L);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);

        Collections.copy(listOfSmallLongs, listOfBigLongs);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);
    }
}
