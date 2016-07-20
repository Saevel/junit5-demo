package prv.zielony.junit5.demo.tests.parametric;

import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;

/**
 * Created by Zielony on 2016-07-20.
 */
public class Fibonacci implements LongUnaryOperator {

    @Override
    public long applyAsLong(long value) {
        if(value == 0) {
            return 1;
        }
        else if(value == 1) {
            return 2;
        }
        else {
            return applyAsLong(value-1) + applyAsLong(value - 2);
        }
    }
}
