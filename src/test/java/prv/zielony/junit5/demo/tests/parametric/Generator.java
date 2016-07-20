package prv.zielony.junit5.demo.tests.parametric;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Zielony on 2016-07-19.
 */
public abstract class Generator<T> {

    protected Long seed;

    public Generator(Long seed) {
        this.seed = seed;
    }

    public abstract T next();

    public <X> Generator<X> map(Function<T, X> f) {
        Supplier<T> supplier = this::next;
        return new Generator<X>(seed) {
            public X next() {
                return f.apply(supplier.get());
            }
        };
    }

    public <X> Generator<X> flatMap(Function<T, Generator<X>> f) {
        return f.apply(next());
    }
}
