package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        
          System.out.println("Wprowadz dane");
         Scanner imie= new Scanner(System.in);
        System.out.println("Wprowadz imie:");
         String a=imie.next();
         System.out.println("Wprowadz nazwisko:");
         String b=imie.next();
         System.out.println("Wprowadz nr_indeksu:");
          int c=imie.nextInt();
          System.out.println("Wprowadz nazwe specjalizacji:");
         String d=imie.next();
         System.out.println("Wprowadz rok studiow:");
         int e=imie.nextInt();
        
        Student osoba1 = new Student(a, b, c,d,e);
        osoba1.pokazDane();
        
        // TODO zad 4, 5
    }
    
}






