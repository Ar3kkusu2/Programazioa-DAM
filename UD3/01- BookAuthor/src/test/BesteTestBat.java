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
public class BesteTestBat {
    public static void main(String[] args) {
        
        Author a1 = new Author("Santiago Posteguillo","sapolibros@nowhere.com",'m');
        System.out.println(a1);
        
        System.out.println("Izena: " + a1.getName());
        System.out.println("eMaila: " + a1.getEmail());
        System.out.println("Generoa: " + a1.getGender());
        
        if (a1.getGender() == 'm'){
            System.out.println("Generoa: Gizona");
        }else if (a1.getGender() == 'f'){
            System.out.println("Generoa: Emakumea");
        }else {
             System.out.println("Generoa: " + a1.getGender());
        }
        
        System.out.println();
        
        Book b1 = new Book("Las Legiones Malditas",a1,18.50,7);
        System.out.println(b1);
        
        System.out.println("Izena: " + b1.getName());
        System.out.println("Autorea: " + b1.getAuthor().getEmail()+"("+b1.getAuthor().getEmail()+")");        
        System.out.println("Prezioa: " + b1.getPrice());
        System.out.println("Kantitatea: " + b1.getQty());
        
        System.out.println();
        
        Author a2 = new Author("J.K. Rowling","howards@nowhere.com",'f');
        Book[] nireLiburuGogokoenak = new Book[3];
        nireLiburuGogokoenak[0] = new Book("Harry Potter",a2,20,10);
        nireLiburuGogokoenak[1] = new Book("Animales Fantasticos",a2,8.60,15);
        nireLiburuGogokoenak[2] = new Book("Las Legiones Malditas",a1,18.50,7);

        for (int i = 0; i <= nireLiburuGogokoenak.length-1; i++){
            System.out.println(nireLiburuGogokoenak[i]);
        }
        
        a2.setEmail("magicauthor@howards.com");
        System.out.println();
        
        for (int i = 0; i <= nireLiburuGogokoenak.length-1; i++){
            System.out.println(nireLiburuGogokoenak[i]);
        }
        
        ArrayList<Book> liburu = new ArrayList<Book>();
        
        for (int i = 0; i <= nireLiburuGogokoenak.length-1; i++){
            liburu.add(nireLiburuGogokoenak[i]);
        }
        
        System.out.println("\n"+liburu);
    }
}
