package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.beans.BeanIntrospection;

public class IntrospectionTestTest {


    @Test
    public void testIntrospection() throws Exception {
        // Given, When
        BeanIntrospection<IntrospectedClass> introspection = BeanIntrospection.getIntrospection(IntrospectedClass.class);

        // Then
        assertEquals(Arrays.asList("aId", "xForwarderFor"), Arrays.asList(introspection.getPropertyNames()));
    }

    @Introspected
    public static class IntrospectedClass {

        private String aId;

        private String xForwarderFor;

        public String getAId() {
            return aId;
        }

        public String getXForwarderFor() {
            return xForwarderFor;
        }

    }

}
