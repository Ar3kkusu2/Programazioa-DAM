/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import model.Author;
import model.Book;

/**
 *
 * @author moreno.manuel
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        ArrayList<Author> autore = new ArrayList<Author>(); 
        
        autore.add(new Author("Santiago Posteguillo","sapolibros@nowhere.com",'m'));
        autore.add(new Author("J.K. Rowling","howards@nowhere.com",'f'));
        
        ArrayList<Book> liburu = new ArrayList<Book>();
        
        liburu.add(new Book("Las Legiones Malditas",autore.get(0),18.50,7));
        liburu.add(new Book("Harry Potter",autore.get(1),20,10));
        liburu.add(new Book("Animales Fantasticos",autore.get(1),8.60,15));
        
        
    }
}
