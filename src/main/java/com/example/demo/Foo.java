package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
class Foo {
    @Resource
    private Bar bar;
    @Resource
    private Baz baz;

    int apply() {
        if (baz.apply() > 10)
        return (bar.apply() ? 1 : 2);
        else
            return 0;
    }
}
