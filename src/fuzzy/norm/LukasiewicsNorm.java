package fuzzy.norm;

/**
 * LukasiewicsNorm - Lukasiewics t-(co-)norm pair

 */
public class LukasiewicsNorm implements Norm {

    @Override
    public double norm(double a, double b) {
        return Math.max((a + b - 1), 0);
    }

    @Override
    public double conorm(double a, double b) {
        return Math.min(a + b, 1);
    }

}
