package session9.exercises.c_exercise_decorator_pattern;

import session9.exercises.c_exercise_decorator_pattern.apis.DataEncryptor;

public class EncryptorDecorator implements SendDataService {
    private final SendDataService delegate;
    private final DataEncryptor encryptor;

    public EncryptorDecorator(SendDataService delegate) {
        this.delegate = delegate;
        this.encryptor = new DataEncryptor();
    }

    @Override
    public void sendData(String data) {
        String encryptedData = encryptor.encryptData(data);
        delegate.sendData(encryptedData);
    }
}
