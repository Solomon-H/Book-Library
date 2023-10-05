package org.example;

public class Textbook extends Book{
    private int edition;
    private String[] supplementaryMaterials;

    public Textbook(String title, String author, String publisher, double price, int edition, String[] supplementaryMaterials) {
        super(title, author, publisher, price);
        this.edition = edition;
        this.supplementaryMaterials = supplementaryMaterials;
    }

}
