package org.example;
import models.Actor;
import models.Movie;
import models.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person tomHanks = new Person("Tom", "Hanks");
        Person angelinaJolie = new Person("Angelina", "Jolie");


        //wynagrodzenie dla toma

        int wynagrodzenieToma = tomHanks.calculateSalary(3000000, 4);
        System.out.println("Wynagrodzenie toma hanksa = " + wynagrodzenieToma);

        //wynagrodzenie angeliny
        int wynagrodzenieAngeliny = angelinaJolie.calculateSalary(6000000, 9);
        System.out.println("Wynagrodzenie angeliny = " + wynagrodzenieAngeliny);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj swoje imię:");
//        String imie = scanner.nextLine();
//
//        if (imie.equals("Donald")) {
//            System.out.println("Przykro mi, ale Cię nie znam.");
//            System.exit(1);
//        }
//        else if (imie.equals("Brad"))
//            System.out.println("Witaj " + imie + " miło Cię widzieć. :-)");
//        else {
//            System.out.println("Cześć " + imie + ".");
//        }


//        System.out.print("Podaj swoje imię: ");
//        var imie = scanner.nextLine();
//        switch(imie) {
//            case "Agata","Mateusz", "Leszek", "Paweł", "Iwona", "Adam", "Darek", "Adrian":
//                System.out.println("Cześć " + imie + " miło Cię widzieć.");
//                break;
//            default:
//                System.out.print("Sorki ale nie znam Cię :(");
//                System.exit(1);
//        }


//        Movie film1 = new Movie();
//        film1.setTitle("Pulp Fiction");
//        film1.setBudget(10.09);
//        film1.setCategory('C');
//        film1.setRating(100);
//        film1.setMovieProzed(true);
//
//        double l1;
//        l1 = film1.getBudget();
//        System.out.println(l1);
//        Actor tomCruse = new Actor("Tom","Cruse",5,false);
//        Actor tomHanks = new Actor("Tom","Hanks",4, true);
//        Actor sandraBullock = new Actor("Sandra","Bullock",3, true);
//
//
//        Movie topGun = new Movie("Top Gun",15,'A',66.3,true);
//        Movie avatar = new Movie("Avatar",1,'B',1166.3,true);
//
//            //czy film jest popularny: rating: 1-10, poniżej niepopularny
//        if (topGun.getRating() < avatar.getRating()){
//            System.out.println("Popularniejszy film to: " + topGun.getTitle());
//        } else if(topGun.getRating() == avatar.getRating()) {
//            System.out.println("To są równorzędne filmy");
//        } else {System.out.println("Popularniejszy film to: " + avatar.getTitle());


    }

}