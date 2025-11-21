package session9.exercises.c_exercise_decorator_pattern;

import session9.exercises.c_exercise_decorator_pattern.apis.DataCompressor;

public class CompressorDecorator implements SendDataService {
    private final SendDataService delegate;
    private final DataCompressor compressor;

    public CompressorDecorator(SendDataService delegate) {
        this.delegate = delegate;
        this.compressor = new DataCompressor();
    }

    @Override
    public void sendData(String data) {
        String compressedData = compressor.compressData(data);
        delegate.sendData(compressedData);
    }
}
