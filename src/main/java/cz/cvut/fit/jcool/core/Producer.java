package cz.cvut.fit.jcool.core;

/**
 *
 * @author ytoh
 * @param <T>
 */
public interface Producer<T> {

    void addConsumer(Consumer<? super T> consumer);

    T getValue();
}
