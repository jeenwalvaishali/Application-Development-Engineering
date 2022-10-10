package com.company;

//Question 9: Write a program to create a book class. The Book class would have following private variables
//String name;
//int bookID;
//String genres;
//double price;
//Create a constructor to initialize the values. Create getters and setters for variables.

public class Book {

    private String name;
    private int bookId;
    private String genres;
    private double price;

    //constructor declaration of class book
    public Book(String name, int bookId, String genres, double price)
    {
        this.name = name;
        this.bookId = bookId;
        this.genres = genres;
        this.price = price;
    }

    //getters and setters for variables
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBookId(){
        return bookId;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public String getGenres(){
        return genres;
    }

    public void setGenres(String genres)
    {
        this.genres= genres;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

}

class MainBook {
    public static void main(String[] args)
    {
        //creating object of class book
        Book book = new Book("IKIGAI", 12, "Self-Help" , 499);
        System.out.println(book.getName());
        System.out.println(book.getBookId());
        System.out.println(book.getGenres());
        System.out.println(book.getPrice());

        //Updating genres and price of book
        book.setGenres("Self-Help");
        book.setPrice(700);

        System.out.println("Updated Price and Genres of Book");
        System.out.println(book.getName());
        System.out.println(book.getBookId());
        System.out.println(book.getGenres());
        System.out.println(book.getPrice());
    }

}