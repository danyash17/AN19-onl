package daniils.lesson13;

@FunctionalInterface
public interface TriConsumer<T, R, U> {

    void accept(T t, R r, U u);

}
