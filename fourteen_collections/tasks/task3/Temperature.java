package fourteen_collections.tasks.task3;

import java.util.ArrayList;

public class Temperature {
    ArrayList<Integer> temperatures;

    public void addTemperature(int temperature) {
        temperatures.add(temperature);
    }

    public Integer findLongestSequenceOverTwentyFive() {
        int tempSequence = 0;
        int longestSequence = 0;

        for (Integer temp : temperatures) {
            if (temp > 25) {
                tempSequence++;
                longestSequence = Math.max(longestSequence, tempSequence);
            } else {
                tempSequence = 0;
            }
        }
        return longestSequence;
    }

    public Integer amountBigChanges() {
        int jumpCounts = 0;
        for (int i = 0; i < temperatures.size() - 1; i++) {
            int difference = Math.abs(temperatures.get(i) - temperatures.get(i + 1));
            if (difference > 10) {
                jumpCounts++;
            }
        }
        return jumpCounts;
    }

    public ArrayList<Integer> printDaysOverAverageTemp() {
        ArrayList<Integer> daysOverAverage = new ArrayList<>();
        int totalTemperature = 0;
        double averageTemperature = 0;
        for (Integer t : temperatures) {
            totalTemperature += t;
        }
        averageTemperature = (double) totalTemperature / temperatures.size();
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > averageTemperature) {
                daysOverAverage.add(i + 1);
            }
        }
        return daysOverAverage;
    }
}


/*
1. Перебираем температуры
2. Если температура больше 25 то +1 временная становится
3. Если температура меньше 25 - то сохраняем значение временной в максимальную и временная становится 0
4. В конце просто выводим максимум сколько дней было подряд 25+.
 */