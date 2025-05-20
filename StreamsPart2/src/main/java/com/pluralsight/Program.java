package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.*;

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
        String name = scanner.nextLine().trim().toLowerCase();
        
//        System.out.println("\nFound Match:");
//        boolean found = false;
//        for (Person p : people) {
//            if (p.getFirstName().equalsIgnoreCase(name) || p.getLastName().equalsIgnoreCase(name)) {
//                System.out.println(p);
//                found = true;
//            }
//        }
//
//        if (!found) {
//            System.out.println("No matches found.");
//        }

        people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(name) || person.getLastName().equalsIgnoreCase(name))
                .forEach(System.out::println);

        int totalAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);

        double averageAge = totalAge / (double) people.size();
        System.out.printf("Average age: %.2f%n", averageAge);

        Optional<Person> oldest = people.stream().max(Comparator.comparingInt(Person::getAge));

        Optional<Person> youngest = people.stream().min(Comparator.comparingInt(Person::getAge));

        System.out.println("Oldest age: " + (oldest.map(Person::getAge).orElse(-1)));
        System.out.println("Youngest age: " + (youngest.map(Person::getAge).orElse(-1)));

//        int totalAge = 0;
//        int maxAge = Integer.MIN_VALUE;
//        int minAge = Integer.MAX_VALUE;
//
//        for (Person p : people) {
//            int age = p.getAge();
//            totalAge += age;
//            if (age > maxAge) maxAge = age;
//            if (age < minAge) minAge = age;
//        }
//
//        double averageAge = (double) totalAge / people.size();
//
//        System.out.printf("\nAverage Age: %.1f\n", averageAge);
//        System.out.println("Oldest Age: " + maxAge);
//        System.out.println("Youngest Age: " + minAge + "\n");

        for (Person person : people) {
            System.out.println(person);
        }
    }
}