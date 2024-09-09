package daniils.lesson13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsShowcases {

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        int total = numbers.stream()
//                .reduce(0, (sum, n) -> sum + n); // Суммируем числа
//
//        System.out.println("Общая сумма: " + total); // Вывод: 15
//    }

    public static void main(String[] args) {
        int max = Arrays.stream(new int[]{1, 2, 3, 4})
                .filter(x -> x == 2)
                .findFirst().getAsInt();
        System.out.println(max);
    }
}
