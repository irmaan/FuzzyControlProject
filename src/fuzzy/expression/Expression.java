package fuzzy.expression;

import fuzzy.norm.Norm;
import java.util.Map;

/**
 * Expression - Arbitrary CNF/DNF expression

 */
public interface Expression {

    /**
     * evaluate - evaluate an expression
     * @param norm the t-(co-)norm pair to be used
     * @param inputs mapping of variables to input values
     * @return membership
     */
    public double evaluate(Norm norm, Map<String, Double> inputs);

}
