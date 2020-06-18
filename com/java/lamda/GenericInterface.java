package com.java.lamda;

@FunctionalInterface
public interface GenericInterface<T> {

    // generic method
    T func(T t);
}
