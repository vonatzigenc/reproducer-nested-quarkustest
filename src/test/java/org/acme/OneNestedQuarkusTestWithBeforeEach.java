package org.acme;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

/**
 * This testcase will fail because of IllegalArgumentException.
 *
 * "java.lang.IllegalArgumentException: object is not an instance of declaring class."
 *
 *
 * in io.quarkus.test.junit.QuarkusTestExtension.runExtensionMethod(QuarkusTestExtension.java:1084) the method "void
 * org.acme.NestedQuarkusTest.generalBeforeEach()" is invoked with instance of  org.acme.NestedQuarkusTest.Bar.
 */
@QuarkusTest
public class OneNestedQuarkusTestWithBeforeEach {

   
    @BeforeEach
    void generalBeforeEach() {

    }

    @Nested
    class Foo {
        @Test
        void checkA() {
            Assertions.assertTrue(true);
        }

        @Test
        void checkB() {
            Assertions.assertTrue(true);
        }
    }

}
