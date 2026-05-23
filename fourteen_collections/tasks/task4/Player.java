package fourteen_collections.tasks.task4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player {

    LinkedList<String> playlist = new LinkedList<>();
    ListIterator<String> iterator = playlist.listIterator();

    public String nextSong() {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return "Песен не осталось";
    }

    public String previousSong() {
        if (iterator.hasPrevious()) {
            return iterator.previous();
        }
        return "Песен не осталось";
    }

    public void shufflePlaylist() {
        Collections.shuffle(playlist);
        iterator = playlist.listIterator();
    }

    public void removeSong(String songName) {
        playlist.remove(songName);
        iterator = playlist.listIterator();
    }

    public String repeatSong(String songName) {
        if (playlist.contains(songName)) {
            return songName;
        }
        return "Такой песни нет";
    }
}
