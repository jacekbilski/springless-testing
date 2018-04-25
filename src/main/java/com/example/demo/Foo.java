package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
class Foo {
    @Resource
    private Bar bar;

    int apply() {
        return (bar.apply() ? 1 : 2);
    }
}
