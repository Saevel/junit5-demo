package prv.zielony.junit5.demo.tests.extensions;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;

/**
 * Created by kowczarek on 2016-07-20.
 */
@SampleExtensionAnnotation
public class SampleExtendedTest {

    @Test
    public void firstTest() {
        System.out.println("\t\tFIRST TEST");
    }

    @Test
    public void secondTest() {
        System.out.println("\t\tSECOND TEST");
    }
}
