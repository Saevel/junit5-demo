package prv.zielony.junit5.demo.tests.extensions;


import org.junit.jupiter.api.extension.*;

/**
 * Created by kowczarek on 2016-07-20.
 */
public class SampleExtension implements BeforeAllCallback, AfterAllCallback,
        BeforeEachCallback, AfterEachCallback {

    @Override
    public void afterAll(ContainerExtensionContext context) throws Exception {
       System.out.println("AFTER ALL");
    }

    @Override
    public void afterEach(TestExtensionContext context) throws Exception {
        System.out.println("\tAFTER EACH");
    }

    @Override
    public void beforeAll(ContainerExtensionContext context) throws Exception {
        System.out.println("\n\nBEFORE ALL");
    }

    @Override
    public void beforeEach(TestExtensionContext context) throws Exception {
        System.out.println("\tBEFORE EACH");
    }
}
