package com.example.demo;

import org.springframework.stereotype.Component;

@Component
class Foo {
    private Bar bar;

    Foo(Bar bar) {
        this.bar = bar;
    }

    int apply() {
        return (bar.apply() ? 1 : 2);
    }
}
