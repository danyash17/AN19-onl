package vadimavetisov.lesson13;

import java.util.*;

public class StreamAPI {

    //Задача 1: Фильтрация четных чисел. Дан список целых чисел.
    // Используя Stream API, отфильтруйте четные числа и выведите их на экран.
    public static String evenNum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        return evenNumbers.toString();
    }

    //Задача 2: Удаление пробелов. Создайте список строк с лишними пробелами в начале и конце.
    // Используя Stream API, удалите пробелы и выведите очищенные строки.
    public static String spaces() {
        List<String> names = Arrays.asList(" John ", " Daenerys ", " Tyrion ", " Eddard ", " Arya ");

        List<String> withoutSpaces = names.stream().map(String::trim).toList();

        return withoutSpaces.toString();
    }

    //Задача 3: Сумма чисел. Дан список целых чисел. Используя Stream API, найдите сумму всех чисел в списке.
    public static String sum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream().reduce(0, Integer::sum).toString();
    }

    //Задача 4: Преобразование строк в верхний регистр. Создайте список строк и используйте Stream API
    // для преобразования всех строк в верхний регистр. Выведите результат на экран.
    public static String upperCase() {
        List<String> names = Arrays.asList(" John ", " Daenerys ", " Tyrion ", " Eddard ", " Arya ");

        List<String> UpperCaseAndWithoutSpaces = names.stream().map(String::toUpperCase).map(String::trim).toList();
        //лень было вручную убирать
        //пробелы, под другую задачу
        return UpperCaseAndWithoutSpaces.toString();
    }

    //Задача 5: Поиск максимального числа. Дан список целых чисел. Используя Stream API, найдите максимальное число в списке.
    public static String maxNum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream().reduce(0, Integer::max).toString();
    }

    //Анализ отзывов о продуктах:
    //У вас есть список отзывов о продуктах с оценками от 1 до 7. Найдите среднюю оценку для каждого продукта
    // и определите, какие продукты имеют наибольшее количество положительных отзывов (оценка 4 и выше).
    public static String reviews() {
        HashMap<String, List<Integer>> productsWithReviews = new HashMap<>();

        List<Integer> aReviews = Collections.singletonList(new Random().ints(3093, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> bReviews = Collections.singletonList(new Random().ints(2340, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> cReviews = Collections.singletonList(new Random().ints(3714, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> dReviews = Collections.singletonList(new Random().ints(1365, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> eReviews = Collections.singletonList(new Random().ints(3790, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> fReviews = Collections.singletonList(new Random().ints(2121, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> gReviews = Collections.singletonList(new Random().ints(3660, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> hReviews = Collections.singletonList(new Random().ints(1861, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> iReviews = Collections.singletonList(new Random().ints(2924, 1, 8).boxed().reduce(0, Integer::sum));
        List<Integer> jReviews = Collections.singletonList(new Random().ints(3284, 1, 8).boxed().reduce(0, Integer::sum));

        List<Integer> aReviewsAverage = aReviews.stream().map(x -> x / 3093).filter(n -> n >= 4).toList();
        List<Integer> bReviewsAverage = bReviews.stream().map(x -> x / 2340).filter(n -> n >= 4).toList();
        List<Integer> cReviewsAverage = cReviews.stream().map(x -> x / 3714).filter(n -> n >= 4).toList();
        List<Integer> dReviewsAverage = dReviews.stream().map(x -> x / 1365).filter(n -> n >= 4).toList();
        List<Integer> eReviewsAverage = eReviews.stream().map(x -> x / 3790).filter(n -> n >= 4).toList();
        List<Integer> fReviewsAverage = fReviews.stream().map(x -> x / 2121).filter(n -> n >= 4).toList();
        List<Integer> gReviewsAverage = gReviews.stream().map(x -> x / 3660).filter(n -> n >= 4).toList();
        List<Integer> hReviewsAverage = hReviews.stream().map(x -> x / 1861).filter(n -> n >= 4).toList();
        List<Integer> iReviewsAverage = iReviews.stream().map(x -> x / 2924).filter(n -> n >= 4).toList();
        List<Integer> jReviewsAverage = jReviews.stream().map(x -> x / 3284).filter(n -> n >= 4).toList();

        productsWithReviews.put("aProduct", aReviewsAverage);
        productsWithReviews.put("bProduct", bReviewsAverage);
        productsWithReviews.put("cProduct", cReviewsAverage);
        productsWithReviews.put("dProduct", dReviewsAverage);
        productsWithReviews.put("eProduct", eReviewsAverage);
        productsWithReviews.put("fProduct", fReviewsAverage);
        productsWithReviews.put("gProduct", gReviewsAverage);
        productsWithReviews.put("hProduct", hReviewsAverage);
        productsWithReviews.put("iProduct", iReviewsAverage);
        productsWithReviews.put("jProduct", jReviewsAverage);

        return productsWithReviews.toString();
    }
}
