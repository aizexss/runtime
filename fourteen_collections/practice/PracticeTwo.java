package fourteen_collections.practice;

import java.util.ArrayList;
import java.util.Collection;

public class PracticeTwo {
    public static void main(String[] args) {
        final Collection<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");

        final Collection<String> colorsAdditional = new ArrayList<>();
        colorsAdditional.add("Green");
        colorsAdditional.add("Yellow");

        colors.addAll(colorsAdditional);
        System.out.println(colors);

        final Collection<String> greenAndRed = new ArrayList<>();
        greenAndRed.add("Green");
        greenAndRed.add("Red");
        System.out.println("Список содержит Зеленый и Красный: " + colors.containsAll(greenAndRed));

        final Collection<String> yellowOnly = new ArrayList<>();
        yellowOnly.add("Yellow");
        colors.removeAll(yellowOnly);

        System.out.println(colors);
    }
}
