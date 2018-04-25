package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = DemoApplication.class)
@ExtendWith(SpringExtension.class)
class FooTest {
    @Resource
    private Foo foo;
    @MockBean
    private Bar bar;

    @Test
    void ifBar_return1() {
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
