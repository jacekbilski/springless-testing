package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FooTest {
    private Bar bar = mock(Bar.class);
    private Foo foo = new Foo(bar);

    @Test
    void ifBazAbove10AndBar_return1() {
        when(baz.apply()).thenReturn(12);
        when(bar.apply()).thenReturn(true);
        int result = foo.apply();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void ifNotBar_return2() {
        when(bar.apply()).thenReturn(false);
        int result = foo.apply();
        assertThat(result).isEqualTo(2);
    }
}
