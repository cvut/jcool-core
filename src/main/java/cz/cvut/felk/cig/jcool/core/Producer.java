package cz.cvut.felk.cig.jcool.core;

/**
 *
 * @author ytoh
 * @param <T>
 */
public interface Producer<T> {

    void addConsumer(Consumer<? super T> consumer);

    T getValue();
}
