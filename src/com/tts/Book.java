package com.tts;

public class Book {

    String title;
    boolean borrowed;


    // Set the variables of "title" and "borrowed" as equal to something at their creation:
    public Book(String bookTitle) {
        // Implement this method
        this.title = bookTitle;
        this.borrowed = false;

    }

    // Mark the book as having the potential state of "borrowed" (correction from typo which read "rented"):
    public void borrowed() {
        // Implement this method
        this.borrowed = true;
    }

    // Marks the book as having the potential state of "not rented," or in other words - "in stock"
//    (return the book to its original state):
    public void returned() {
        // Implement this method
        this.borrowed = false;
    }

    // Returns true if the book is borrowed, false otherwise
    public boolean isBorrowed() {
        // Implement this method -- WITH AN IF/ELSE STATEMENT (OR THE SIMPLER METHOD BELOW):
            return this.borrowed;
        }

        // Return the title of the book:
        public String getTitle(){
            // Implement this method
            return this.title;
        }

        public static void main(String[] args) {
            // Small test of the Book class
            Book example = new Book("The Da Vinci Code");
            System.out.println("Title: " + example.isBorrowed());
            System.out.println("Borrowed? (should be false): " + example.isBorrowed());
            example.borrowed();
            System.out.println("Borrowed? (should be true): " + example.isBorrowed());
            example.returned();
            System.out.println("Borrowed? (should be false): " + example.isBorrowed());
//            I ALSO F'ED THIS UP WHEN TRYING TO MAKE A MORE 'SENSICAL' PRINTLN STATEMENT FOR A REAL-LIFE USER (NOT SO SENSICAL NOW, IS IT SMARTY-PANTS;))

        }

    }
