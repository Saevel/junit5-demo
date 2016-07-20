package prv.zielony.junit5.demo.tests.dynamic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.extension.BeforeEachExtensionPoint;
import org.junit.gen5.api.extension.ExtendWith;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Created by Zielony on 2016-07-19.
 */
public class DynamicTestsTest {

    @TestFactory
    public Stream<DynamicTest> createTests() {

        return LongStream
                .range(0, 10)
                .boxed()
                .map((Long element) -> dynamicTest(
                        "Can remove " + element + " from itself", () -> {
                            System.out.println("Running dynamic test for element: " + element);
                            Assertions.assertEquals(element - element, 0L);
                        }
                    )
                );
    }
}
