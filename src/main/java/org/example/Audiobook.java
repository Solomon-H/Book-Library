package org.example;

public class Audiobook extends Book {
    public enum AudioFormat { CD, MP3, AAC, WAV }
    private int durationMinutes;
    private AudioFormat audioFormat;

    public Audiobook(String title, String author, String publisher, double price,
                     int durationMinutes, AudioFormat audioFormat) {
        super(title, author, publisher, price);
        this.durationMinutes = durationMinutes;
        this.audioFormat = audioFormat;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    @Override
    public double calculateShippingCost() {
        double shippingCost = 0.0;

        switch (audioFormat) {
            case CD:
                shippingCost = 6.00;
                break;
            case MP3:
                shippingCost = 3.00;
                break;
            case AAC:
                shippingCost = 5.00;
                break;
            case WAV:
                shippingCost = 4.00;
                break;
            default:
                shippingCost = 2.00;
                break;
        }
        return shippingCost;
    }
}
