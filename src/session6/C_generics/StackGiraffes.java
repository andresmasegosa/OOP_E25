package session6.C_generics;

public class StackGiraffes {
    private Giraffe[] stack;
    int count=0;

    public StackGiraffes() {
        stack = new Giraffe[100];
    }

    Giraffe pop() {
        return stack[--count];
    }

    void push(Giraffe o) {
        stack[count++]=o;
    }

}