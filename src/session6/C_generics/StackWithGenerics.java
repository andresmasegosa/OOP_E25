package session6.C_generics;

public class StackWithGenerics<T> {
    private T[] stack;
    int count=0;

    public StackWithGenerics() {
        stack = (T[]) new Object[100];
    }

    T pop() {
        return stack[--count];
    }

    void push(T o) {
        stack[count++]=o;
    }

}