package fuzzy;

import fuzzy.expression.Expression;
import fuzzy.norm.Norm;
import fuzzy.norm.ZadehNorm;
import java.util.Map;

/**
 * Rule - Fuzzy rule

 *
 */
public class Rule {

    private final Expression expression;
    private final Consequence consequence;
    private final Norm norm;

    public Rule(Expression expression, Consequence consequence, Norm norm) {
        this.expression = expression;
        this.consequence = consequence;
        this.norm = norm;
    }

    public Rule(Expression expression, Consequence consequence) {
        // Default to Zadeh t-(co-)norm
        this(expression, consequence, new ZadehNorm());
    }

    public Consequence evaluate(Map<String, Double> inputs) {

        /**
         * 2. Aggregation of multiple conditions
         */
        double membership = this.expression.evaluate(this.norm, inputs);

        /**
         * 3. Determine combined output level
         */
        this.consequence.setLimit(membership);

        return this.consequence;
    }

}
