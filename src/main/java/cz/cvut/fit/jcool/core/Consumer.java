package cz.cvut.fit.jcool.core;

/**
 *
 * @author ytoh
 */
public interface Consumer<T> {

    void notifyOf(Producer<? extends T> producer);
}
