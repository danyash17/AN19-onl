package daniils.lesson13;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Simulation {

    public static void main(String[] args) {
//        //Predicate - проверка на null
//        Predicate<Object> nullPredicate = (Object obj) -> {
//            return null == obj;
//        };
//        System.out.println(testPredicate(nullPredicate, new Object()));
//
//        //Consumer - вывод объекта на консоль
//        Consumer<String> printConsumer = str -> {
//            System.out.println(str);
//        };
//        testConsumer(printConsumer, "Hi");
//
//        //Supplier - возврат возраста
//        Supplier<Integer> ageSupplier = () -> {
//            return 22;
//        };
//        System.out.println(testSupplier(ageSupplier));
//
//        //Function - перевод из Double в BigDecimal
//        Function<Double, BigDecimal> doubleBigDecimalFunction = doubleNum -> {
//            return BigDecimal.valueOf(doubleNum);
//        };
//        System.out.println(testFunction(doubleBigDecimalFunction, 2d));
//
//        TriConsumer<String, String, String> concatenator = (String first, String second, String third) -> {
//            System.out.println(first + second + third);
//        };
//
//        concatenator.accept("He","l","lo");

        Optional<Object> optionalObject = Optional.ofNullable(new Object());

        Consumer<Object> action = obj -> System.out.println("Wow, I have " + obj + " inside!");
        Runnable emptyAction = () -> System.out.println("Oh no, I am empty");
        optionalObject.ifPresent(action);

    }

    private static boolean testPredicate(Predicate<Object> predicate, Object toTest){
        return predicate.test(toTest);
    }

    private static void testConsumer(Consumer<String> consumer, String toTest){
        consumer.accept(toTest);
    }

    private static Integer testSupplier(Supplier<Integer> supplier){
        return supplier.get();
    }

    private static BigDecimal testFunction(Function<Double, BigDecimal> function, Double toTest){
        return function.apply(toTest);
    }

}
