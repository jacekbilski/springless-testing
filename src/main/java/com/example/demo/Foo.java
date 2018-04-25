package com.example.demo;

import org.springframework.stereotype.Component;

@Component
class Foo {
    private Bar bar;
    private Baz baz;

    Foo(Bar bar, Baz baz) {
        this.baz = baz;
        this.bar = bar;
    }

    int apply() {
        if (baz.apply() > 10)
            return (bar.apply() ? 1 : 2);
        else
            return 0;
    }
}
