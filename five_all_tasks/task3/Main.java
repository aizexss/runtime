package five_all_tasks.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("У игроков %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1

        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Number 1");
                case -1:
                    System.out.println("Game over!");
            }
        }
    }
}
