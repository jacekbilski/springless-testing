package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = DemoApplication.class)
@ExtendWith(SpringExtension.class)
class FooTest {
    @Resource
    private Foo foo;

    @Test
    void ifBar_return1() {
        int result = foo.apply();
        assertThat(result).isEqualTo(1);
    }
}
