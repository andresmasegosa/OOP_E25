package session6.C_generics;

public class StackBooks {
    private Book[] stack;
    int count=0;

    public StackBooks() {
        stack = new Book[100];
    }

    Book pop() {
        return stack[--count];
    }

    void push(Book o) {
        stack[count++]=o;
    }

}