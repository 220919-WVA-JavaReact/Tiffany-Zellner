package com.revature.classes_objects;

public class PersonDriver {
    public static void main(String[] args) {
        int num = 9;
        Person bryan = new Person("Bryan", 71.75, 250.5, 25);

        System.out.println(bryan.height);
        System.out.println(bryan.name);

        Person kaitlyn = new Person("Kaitlyn", 68.5, 135.6, 24);

        System.out.println(kaitlyn.weight);

        bryan.walk(5);

        kaitlyn.talk();
        System.out.println(kaitlyn.talk());

        Person jimmy = new Person();

        System.out.println(jimmy.weight);

        Person kyle = new Person("Kyle");

        System.out.println(kyle.weight);

        System.out.println(jimmy.name);

        System.out.println(kyle.name);

        jimmy.name = "Jimmy";

        System.out.println(jimmy.name);
    }
}
