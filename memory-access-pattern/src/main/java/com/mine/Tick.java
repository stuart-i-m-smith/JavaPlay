package com.mine;

import sun.misc.Unsafe;

public class Tick {

    private static long offset = 0;

    private static final long tradeIdOffset = offset += 0;
    private static final long clientIdOffset = offset += 8;
    private static final long timeOffset = offset += 8;
    private static final long priceOffset = offset += 8;

    private static final long objectSize = offset += 2;
    private final Unsafe unsafe;

    public Tick(Unsafe unsafe){
        this.unsafe = unsafe;
    }



}
