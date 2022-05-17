package app;

import something.Book;
import something.Poster;
import something.Reader;
import zombi.appocalipces.Car;
import zombi.appocalipces.OldZombie;
import zombi.appocalipces.PolicemanZombie;
import zombi.appocalipces.Zombie;

public class Main {
    public static void main(String[] args) {
        hello("John");
        Book oldBook = new Book("War and Peace", 1500);
        Book newBook = new Book("War and Peace", 1500);
        Poster brightPoster = new Poster("Brad Pitt");
        System.out.println(oldBook.equals(newBook));
        System.out.println(oldBook.theSame(newBook));
        System.out.println(brightPoster.getName());
        Reader reader1 = new Reader(oldBook);
        Reader reader2 = new Reader(brightPoster);
        reader1.whatAmIReading();
        reader2.whatAmIReading();
        OldZombie katrin = new OldZombie();
        katrin.go();
        PolicemanZombie john = new PolicemanZombie();
        Car car = new Car(john);
        car.zombieDriver.go();
        john.shoot();
        oldBook.open(77);
        oldBook.open(0);
        oldBook.open(1501);
        oldBook.open(-233);
        System.out.println(oldBook.getName());
        System.out.println(oldBook.readLine(15));
        System.out.println("----------------");
        System.out.println(oldBook.publicationHouse());
    }
    public static void hello(String name){
        System.out.println("Hello, " + name);
    }
}
