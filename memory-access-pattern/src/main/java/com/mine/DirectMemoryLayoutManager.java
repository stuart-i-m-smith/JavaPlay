package com.mine;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class DirectMemoryLayoutManager {

    private Unsafe unsafe;

    public void initialize() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Unsafe getUnsafe() {
        return this.unsafe;
    }
}
