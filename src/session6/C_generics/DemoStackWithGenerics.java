package session6.C_generics;


public class DemoStackWithGenerics {

    public static void main(String[] args) {

        StackWithGenerics<Giraffe> giraffeStack = new StackWithGenerics<>();

        Giraffe giraffe1 = new Giraffe();

        giraffeStack.push(giraffe1);

        Giraffe giraffe2 = giraffeStack.pop();

        Book book = new Book();

        //giraffeStack.push(book);


        StackWithGenerics<Book> bookStack = new StackWithGenerics<>();

        bookStack.push(book);

        //bookStack.push(giraffe1);

        //Book book2 = stack.pop();
    }

}
