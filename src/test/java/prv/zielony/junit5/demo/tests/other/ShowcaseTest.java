package prv.zielony.junit5.demo.tests.other;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

/**
 * Created by kowczarek on 2016-07-20.
 */
@DisplayName("OuterTest")
public class ShowcaseTest {

    @Nested
    class NestedTest {
        @Test
        @DisplayName("InnerTest")
        public void inner(){
            System.out.println("\n\nNested Test was invoked");
        }

    }

    @Disabled
    public void disabledTest() {
        System.out.println("\nDisabled test was not invoked");
    }
}
