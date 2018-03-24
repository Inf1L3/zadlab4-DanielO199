package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student[] t = new Student[100];
        for (int i = 0; i < 100; i++) {

            t[i] = new Student("", "", 0, "", 0);

        }
        System.out.println("Co chcesz zrobic?: ");
        System.out.println("1)Wprowadz dane studenta pod wybrany indeks tablicy");
        System.out.println("2)Edytuj dane studenta z pod wybranego indeksu");
        System.out.println("3)Usun dane studenta");
        System.out.println("4)Wyswietl wszystkich studentow");
        System.out.println("5)Wyswietl dane wybranego studenta");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("1)Wprowadz numer indeksu");
                int indeks1 = input.nextInt();
                t[indeks1].wprowadzDane();
                break;
            case 2:
                System.out.println("1)Wprowadz numer indeksu");
                int indeks2 = input.nextInt();
                t[indeks2].wprowadzDane();
                break;

            case 3:
                System.out.println("1)Wprowadz numer indeksu");
                int indeks3 = input.nextInt();
                t[indeks3] = new Student("", "", 0, "", 0);
                t[indeks3].pokazDane();
                break;
            case 4:
                System.out.println("Wszyscy Studenci");
                for (int i = 0; i < 100; i++) {
                    t[i].pokazDane();
                }
                break;

            case 5:
                System.out.println("1)Wprowadz numer indeksu");
                int indeks4 = input.nextInt();
                t[indeks4].pokazDane();
                break;

        }

    }

}
