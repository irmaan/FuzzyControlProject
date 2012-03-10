package fuzzy.norm;

/**
 * ProbabilisticNorm - Probabilistic t-(co-)norm pair

 */
public class ProbabilisticNorm implements Norm {

    @Override
    public double norm(double a, double b) {
        return (a * b);
    }

    @Override
    public double conorm(double a, double b) {
        return (a + b - (a * b));
    }

}
