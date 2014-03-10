package cz.cvut.fit.jcool.core;

/**
 *
 * @author ytoh
 */
public class SingleSolution implements Solution {

    private final Point point;
    private final double value;

    public SingleSolution(Point point, double value) {
        this.point = point;
        this.value = value;
    }

    public Point getPoint() {
        return point;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Solution with value: %e at point: %s", value, point);
    }
}
