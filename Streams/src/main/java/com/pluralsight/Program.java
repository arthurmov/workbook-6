package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", "Johnson", 28));
        people.add(new Person("Bob", "Martinez", 35));
        people.add(new Person("Charlie", "Nguyen", 22));
        people.add(new Person("Diana", "Patel", 31));
        people.add(new Person("Ethan", "Walker", 40));
        people.add(new Person("Fiona", "Chen", 26));
        people.add(new Person("George", "Thompson", 33));
        people.add(new Person("Hannah", "Rivera", 29));
        people.add(new Person("Ivan", "Kuznetsov", 24));
        people.add(new Person("Julia", "Morales", 27));



        System.out.println("Search for a name (first or last)");
        String name = scanner.nextLine();

        for (Person person : people) {
            System.out.println(person);
        }
    }
}