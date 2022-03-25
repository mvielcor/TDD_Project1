package org.cefire.library;

public class Book {
    private final String ISBN;
    private final String title;
    private final String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
    //Afegim este mètode per a permetre cerques no exactes al que ha escrit l'usuari
    public String stringToLowerCaseAndWithoutSpaces(String text){
        //Convertim el textToMatch a minúscules, per fer la cerca
        String textToMatchToLowerCase = text.toLowerCase();
        //Eliminem els espais en blanc de la cadena a cercar
        return (textToMatchToLowerCase.replaceAll(" ",""));
    }
    public String getAuthor() {
        return author;
    }
}