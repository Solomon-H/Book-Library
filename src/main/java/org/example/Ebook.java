package org.example;

public class Ebook extends Book{
    private String fileFormat;
    private String downloadLink;

    public Ebook(String title, String author, String genre, String publisher, int numberOfPages, double price,
                 String fileFormat, String downloadLink) {
        super(title, author, publisher, price);
        this.fileFormat = fileFormat;
        this.downloadLink = downloadLink;
    }
    @Override
    public double calculateShippingCost() {
        double shippingCost = 0.0;
        System.out.println("No shipping cost for digital ebooks!");
        return shippingCost;
    }

}
