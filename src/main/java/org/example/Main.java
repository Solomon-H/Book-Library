package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        try {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            // add ebook
            System.out.print("File Format (e.g., PDF): ");
            String fileFormat = scanner.nextLine();
            System.out.print("Download Link: ");
            String downloadLink = scanner.nextLine();
            Ebook ebook = new Ebook(title, author, "ISBN123", publisher, 2023, price, fileFormat, "Fiction");

            // add audiobook
            System.out.print("Duration (minutes): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Audio Format (CD, MP3, AAC, WAV, OTHER): ");
            Audiobook.AudioFormat audioFormat = Audiobook.AudioFormat.valueOf(scanner.nextLine());
            books.add(new Audiobook(title, author, publisher, price, duration, audioFormat));

            // add textbook
            System.out.print("Edition (Year): ");
            int edition = scanner.nextInt();
            scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            books.add(new Textbook(title, author, publisher, price, edition, new String[0]));

            for (Book book : books) {
                double shippingCost = book.calculateShippingCost();
                System.out.println(book.getTitle() + " - $" + book.getPrice() + " - Shipping Cost: $" + shippingCost);
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
