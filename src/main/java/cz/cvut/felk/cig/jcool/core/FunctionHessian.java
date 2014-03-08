package cz.cvut.felk.cig.jcool.core;

/**
 * <code>FunctionHessian</code> is an object that can be used to calculate
 * a hessian of a function at a certain point.
 *
 * @author ytoh
 */
public interface FunctionHessian {

    /**
     * Hessian array at the given point.
     *
     * @param point where the hessian is evaluated
     * @return the calculated hessian
     */
    Hessian hessianAt(Point point);
}
