package fourteen_collections.practice;

import java.util.List;

public class PracticeFour {
    public static void main(String[] args) {
//        String[] citiesArray = {"Astana", "Almaty", "Kokshetau"};
//        List<String> cities = Arrays.asList(citiesArray);

//        List<String> cities = Arrays.asList("Astana", "Almaty", "Kokshetau");

        String[] citiesArray = {"Astana", "Almaty", "Kokshetau"};

        List<String> cities = List.of(citiesArray);
        System.out.println(cities);

        List<String> otherCities = List.of("Амстердам", "Токио", "Рим");
        System.out.println(otherCities);
    }
}
