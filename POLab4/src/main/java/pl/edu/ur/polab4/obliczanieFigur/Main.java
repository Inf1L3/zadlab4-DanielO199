package pl.edu.ur.polab4.obliczanieFigur;

import pl.edu.ur.polab4.*;
import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.Kolo;
import pl.edu.ur.polab4.obliczanieFigur.Kwadrat;
import pl.edu.ur.polab4.obliczanieFigur.Prostokat;
import pl.edu.ur.polab4.obliczanieFigur.Szescian;
import pl.edu.ur.polab4.obliczanieFigur.Prostopadloscian;
import pl.edu.ur.polab4.obliczanieFigur.Kula;
import pl.edu.ur.polab4.obliczanieFigur.Stozek;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz figure:");
        System.out.println("1) Kolo");
        System.out.println("2) Kwadrat");
        System.out.println("3) Prostokat");
        System.out.println("4) Szescian");
        System.out.println("5) Prostopadloscian");
        System.out.println("6) Kula");
        System.out.println("7) Stozek");

        int fig = input.nextInt();

        switch (fig) {
            case 1:
                System.out.println("Wprowadz promien");

                int a = input.nextInt();
                Kolo kolo1 = new Kolo(a);
                kolo1.Pokadane();break;
              
            case 2:
                System.out.println("Wprowadz dlugosc boku");
                int b=input.nextInt();
                Kwadrat kwadrat1= new Kwadrat(b);
                
                kwadrat1.Pokadane();break;
                
            case 3:
                System.out.println("Wprowadz dlugosc 1 boku");
                int c=input.nextInt();
                System.out.println("Wprowadz dlugosc 2 boku");
                int d=input.nextInt();
                Prostokat prostokat1= new Prostokat(c,d);
                prostokat1.Pokadane();break;
            case 4:
                System.out.println("Wprowadz dlugosc boku");
                int e=input.nextInt();
                Szescian szescian1= new Szescian(e);
                szescian1.Pokadane();break;
            case 5:
                System.out.println("Wprowadz dlugosc pierwszego boku");
                int f=input.nextInt();
                System.out.println("Wprowadz dlugosc drugiego boku");
                int g=input.nextInt();
                System.out.println("Wprowadz dlugosc wysokosci");
                int h=input.nextInt();
                Prostopadloscian prosto1 = new Prostopadloscian(f,g,h);
                prosto1.Pokadane();break;
                
                
            case 6:
                System.out.println("Wprowadz dlugosc promienia");
                int i=input.nextInt();
                Kula kula1= new Kula(i);
                kula1.Pokadane();break;
            case 7:
                System.out.println("Wprowadz dlugosc tworzacej");
                int j=input.nextInt();
                System.out.println("Wprowadz dlugosc promienia");
                int k=input.nextInt();
                System.out.println("Wprowadz dlugosc wysokosci");
                int l=input.nextInt();
                Stozek stozek1= new Stozek(j,k,l);
                stozek1.Pokadane();break;
        }
    }

}
