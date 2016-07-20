package prv.zielony.junit5.demo.tests.parametric;

import java.math.BigInteger;

/**
 * Created by Zielony on 2016-07-20.
 */
public class LinearCongruentialGenerator extends Generator<Long> {

    public LinearCongruentialGenerator(Long seed) {
        super(seed);
    }

    @Override
    public Long next() {
        seed = (seed * 11033515245L + 12345) % BigInteger.valueOf(2L).pow(31).longValue();
        return seed;
    }
}
