package session2.A_ClassesAndObjects.exercise;

import feedback.Feedback;

/**
 * Exercise:
 * a) Write a class to represent a person. A person has a first name, last name, and an age.
 * b) Write code that create a person object and outputs the person's information as a string
 * formatted as "Anders, Madsen, 28".
 */
public class Person {
    //Field 1 for Name
    String name;

    //Field 2 for Surname
    String surname;

    //Field 3 for age
    int age;





    public static void main(String[] args) {

        Person anders = new Person();

        anders.name="Anders";
        anders.surname = "Madsen";
        anders.age = 28;

        ///One year later
        anders.age = 29;

        System.out.println("Age: "+anders.age);







        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_A_Classes", I_did_finish, I_did_understand, comment);

    }

}
