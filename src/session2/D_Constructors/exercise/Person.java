package session2.D_Constructors.exercise;

import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name.
 *  a) Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  b) Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  c) Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen” if there is a middle name.
 **/
class Person {
    private String firstName;
    private String middleName; // may be null if no middle name
    private String lastName;

    // Constructor with middle name
    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Constructor without middle name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = null; // explicitly no middle name
        this.lastName = lastName;
    }

    // b) Method to check if person has a middle name
    public boolean hasMiddleName() {
        return middleName != null && !middleName.isEmpty();
    }

    // c) Method to return formatted string
    public String getPersonInfo() {
        if (hasMiddleName()) {
            // Only show the first character of middle name followed by a dot
            return firstName + ", " + middleName.charAt(0) + "., " + lastName;
        } else {
            return firstName + ", " + lastName;
        }
    }

    public static void main(String[] args) {

        Person person = new Person("Anders", "Madsen");

        String out = person.getPersonInfo();
        System.out.println(out);

        Person person2 = new Person("Anders", "Dyre", "Madsen");

        String out2 = person2.getPersonInfo();
        System.out.println(out2);




        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);
        */

    }
}
