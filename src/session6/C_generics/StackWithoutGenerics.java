package session6.C_generics;

public class StackWithoutGenerics {
    private Object[] stack;
    int count=0;

    public StackWithoutGenerics() {
        stack = new Object[100];
    }

    Object pop() {
        return stack[--count];
    }

    void push(Object o) {
        stack[count++]=o;
    }

}