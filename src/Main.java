package StreamAPI.src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sorted2 = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {
                sorted2.add(intList.get(i));
            }
        }
        Collections.sort(sorted2);

        System.out.println(sorted2);
    }
}