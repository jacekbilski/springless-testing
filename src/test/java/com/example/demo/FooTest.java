package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FooTest {
    private Foo foo;

    @Test
    void ifBar_return1() {
        int result = foo.apply();
        assertThat(result).isEqualTo(1);
    }
}
