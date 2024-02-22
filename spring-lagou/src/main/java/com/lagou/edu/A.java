package com.lagou.edu;

import org.springframework.beans.factory.annotation.Autowired;

/*@Component
@Import({C.class})*/
public class A {

    @Autowired
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
}
