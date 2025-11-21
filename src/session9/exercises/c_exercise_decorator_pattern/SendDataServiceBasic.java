package session9.exercises.c_exercise_decorator_pattern;

public class SendDataServiceBasic implements SendDataService {
    private final String serverAddress;

    public SendDataServiceBasic(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @Override
    public void sendData(String data) {
        System.out.println("Sending Data: " + data + " to " + serverAddress);
    }
}
