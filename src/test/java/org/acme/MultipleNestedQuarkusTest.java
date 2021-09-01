package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

/**
 * Fails with org.junit.jupiter.api.extension.TestInstantiationException: Failed to create test instance
 */
@QuarkusTest
public class MultipleNestedQuarkusTest {

    @Nested
    class FirstNested {

        @Nested
        class SecondNested {

            @Nested
            class Foo {

                @Test
                void check(){
                    Assertions.assertTrue(true);
                }
            }

            @Nested
            class Bar {
                @Test
                void check(){
                    Assertions.assertTrue(true);
                }
            }
        }

    }

}
