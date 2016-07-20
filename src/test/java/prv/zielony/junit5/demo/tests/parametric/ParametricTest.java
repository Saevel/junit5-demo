package prv.zielony.junit5.demo.tests.parametric;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Created by Zielony on 2016-07-19.
 */
public class ParametricTest {

    private Random random = new Random();

    private Generator<Long> generator = new LinearCongruentialGenerator(random.nextLong());

    private Fibonacci fibonacci = new Fibonacci();

    @TestFactory
    public Stream<DynamicTest> testFibonacci() {
        return LongStream
                .range(0, 10)
                .boxed()
                .map((Long element) -> Math.abs(generator.next() % 10))
                .map((Long number) -> dynamicTest(
                        "Is defined for " + number, () -> {
                            System.out.print("\n\nRunning parametric tests with param: " + number);
                            fibonacci.applyAsLong(number);
                        }
                    )
                );
    }
}
