package fuzzy.expression;

import fuzzy.norm.Norm;
import java.util.Map;

/**
 * Conjunction - DNF expression
 */
public class Disjunction implements Expression {

    private final Expression left, right;

    public Disjunction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate(Norm norm, Map<String, Double> inputs){
        return norm.conorm(left.evaluate(norm, inputs), right.evaluate(norm, inputs));
    }

}
