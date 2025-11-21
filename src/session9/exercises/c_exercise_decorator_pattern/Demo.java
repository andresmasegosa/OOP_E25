package session9.exercises.c_exercise_decorator_pattern;


public class Demo {
    public static void main(String[] args) {
        SendDataService basicService = new SendDataServiceBasic("http://128.1.1.1");

        SendDataService encryptedService = new EncryptorDecorator(basicService);
        SendDataService compressedAndEncryptedService = new CompressorDecorator(encryptedService);

        basicService.sendData("Hello");
        System.out.println();

        encryptedService.sendData("Hello");
        System.out.println();

        compressedAndEncryptedService.sendData("Hello");
        
        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session10_C", I_did_finish, I_did_understand, comment);
        */

    }
}
