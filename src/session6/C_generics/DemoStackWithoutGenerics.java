package session6.C_generics;


public class DemoStackWithoutGenerics {

    public static void main(String[] args) {

        StackWithoutGenerics giraffStack = new StackWithoutGenerics();

        Giraffe giraffe1 = new Giraffe();

        giraffStack.push(giraffe1);

        Giraffe giraffe2 = (Giraffe) giraffStack.pop();

        Book book = new Book();

        giraffStack.push(book);

        Book book2 = (Book) giraffStack.pop();
    }

}
