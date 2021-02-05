package juc;

import java.util.concurrent.atomic.AtomicInteger;

public class JUCAtomicXX {
    public static void main(String[] args) {
        AtomicInteger count  = new AtomicInteger(0);
        count.incrementAndGet();
    }
}


