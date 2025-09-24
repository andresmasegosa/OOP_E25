package session2.E_Encapsulation.exercise;

import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name. And also an age.
 *  * Create constructors for this class.
 *  * Create the getter and setters that you think are needed here.
 *  * Write code in the main method that illustrates the use of the getters and setters.
 **/

/**
 * Example solution
 */
class Person {
        // Fields
        private String firstName;
        private String middleName; // optional
        private String lastName;
        private int age;

        // Constructor WITHOUT middle name
        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.middleName = null; // explicitly show it's optional
        }

        // Constructor WITH middle name
        public Person(String firstName, String middleName, String lastName, int age) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
        }

        // Getters
        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Method to display full name neatly
        public String getFullName() {
            if (middleName == null || middleName.isEmpty()) {
                return firstName + " " + lastName;
            } else {
                return firstName + " " + middleName + " " + lastName;
            }
        }

    public static void main(String[] args) {

        // Person without middle name
        Person p1 = new Person("Anders", "Madsen", 25);
        System.out.println("Full name: " + p1.getFullName());
        System.out.println("Age: " + p1.getAge());

        // Update age using setter
        p1.setAge(26);
        System.out.println("Updated age: " + p1.getAge());

        // Person with middle name
        Person p2 = new Person("Anders", "Michael", "Madsen", 30);
        System.out.println("Full name: " + p2.getFullName());
        System.out.println("Age: " + p2.getAge());


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
