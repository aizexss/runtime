package fourteen_collections.tasks.task6;

public class Player implements Comparable<Player> {
    String nickname;
    int level;
    int damage;

    public Player(String nickname, int level, int damage) {
        this.nickname = nickname;
        this.level = level;
        this.damage = damage;
    }

    @Override
    public int compareTo(Player other) {
        if (this.level != other.level) {
            return other.level - this.level;
        }

        if (this.damage != other.damage) {
            return other.damage - this.damage;
        }
        return this.nickname.compareTo(other.nickname);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", level=" + level +
                ", damage=" + damage +
                '}';
    }
}
