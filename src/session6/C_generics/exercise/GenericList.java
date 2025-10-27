package session6.C_generics.exercise;


import session6.C_generics.Book;
import session6.C_generics.Giraffe;

/**
 * Exercise:
 *  a) Run the following code and see why the current implementation of a "List" does not provide type safety.
 *  b) Use generics to adapt the following implementation of a "List" to provide type safety.
 */
public class GenericList<T> {
    private T[] array;
    int count=0;

    public GenericList() {
        array = (T[])new Object[100];
    }

    public  void add(T o) {
        array[count++]=o;
    }

    public T get(int i) {
        return array[i];
    }

    public static void main(String[] args) {

        GenericList<Giraffe> genericList = new GenericList();

        Giraffe giraffe = new Giraffe();
        genericList.add(giraffe);

        //Book book = genericList.get(0); //Compilation error

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session5_C", I_did_finish, I_did_understand, comment);
        */
    }
}
