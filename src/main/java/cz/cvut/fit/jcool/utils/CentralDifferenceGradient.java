package cz.cvut.fit.jcool.utils;

import cz.cvut.fit.jcool.core.Gradient;
import cz.cvut.fit.jcool.core.NumericalGradient;
import cz.cvut.fit.jcool.core.ObjectiveFunction;
import cz.cvut.fit.jcool.core.Point;

/**
 * Determine gradient numerically using central difference.
 * Needs 2*n function evaluations.
 *
 * @author drchaj1
 */
public class CentralDifferenceGradient implements NumericalGradient {

    // TODO: comment
    public static double gradientCDStepMult = Math.pow(MachineAccuracy.EPSILON, 1.0 / 3.0);

    public Gradient gradientAt(ObjectiveFunction function, Point point) {
        double[] gradient = new double[function.getDimension()];
        double[] original = point.toArray();
        double[] p = point.toArray();

        double h = 0;
        double fxplus = 0;
        double fxminus = 0;
        for (int i = 0; i < gradient.length; i++) {
            h = gradientCDStepMult * Math.abs(original[i]);
            if (h < gradientCDStepMult) {// TODO revise
                h = gradientCDStepMult;
            }

            p[i] = original[i] + h;
            fxplus = function.valueAt(Point.at(p));
            p[i] = original[i] - h;
            fxminus = function.valueAt(Point.at(p));
            p[i] = original[i];

            // first derivative
            gradient[i] = (fxplus - fxminus) / (2.0 * h);
        }
        return Gradient.valueOf(gradient);
    }
}
