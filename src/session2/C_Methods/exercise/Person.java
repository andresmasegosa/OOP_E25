package session2.C_Methods.exercise;
import feedback.Feedback;

/**
 * Exercise:
 * Start from Person class in A_ClassesAndObjects.
 *     - Add a method that returns whether the person is or not under the legal age (18 years old).
 *     - Add a method that returns a String formatted as, e.g., "Anders, Madsen, 28, Above Legal Age"
 *       or "Thomas, Nielsen, 14, Below Legal Age"
 */
class Person {

    String firstName;
    String lastName;
    int age;


    //Add methods here
    boolean checkAge(){
        if (this.age>=18)
            return true;
        else
            return false;
    }

    String toStringOutput(){
        if (this.checkAge()){
            return this.firstName+", "+this.lastName+", "+this.age+", "+"Above Legal Age";
        }else{
            return this.firstName+", "+this.lastName+", "+this.age+", "+"Non Above Legal Age";
        }
    }

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();
        person.firstName="Anders";
        person.lastName = "Madsen";
        person.age=12;

        String out = person.toStringOutput();
        System.out.println(out);


        Person person2 = new Person();
        person2.firstName="Thomas";
        person2.lastName = "Nielsen";
        person2.age=41;

        String out2 = person2.toStringOutput();
        System.out.println(out2);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_C_Methods", I_did_finish, I_did_understand, comment);


    }

}
