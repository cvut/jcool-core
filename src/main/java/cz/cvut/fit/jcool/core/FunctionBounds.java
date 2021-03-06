package cz.cvut.fit.jcool.core;

/**
 * Objects implementing <code>FunctionBounds</code> can be queried about
 * the bounds of a function's domain.
 *
 * @author ytoh
 */
public interface FunctionBounds {

    /**
     * Lower bounds of function's domain in every dimension.
     *
     * @return array of values representing lower bounds
     */
    double[] getMinimum();

    /**
     * Upper bounds of function's domain in every dimension.
     *
     * @return array of values representing upper bounds
     */
    double[] getMaximum();
}
