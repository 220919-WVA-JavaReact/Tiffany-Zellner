package com.revature.classes_objects;


// The first uncommented line of these hava files should be the package name
// Packages provide useful namespaces for us to declare similar classes with the correct name

public class Person {
    /*
    This is a multiline comment

    We talked about classes and objects yesterday and said classes are blueprints for object, but what do that mean?

    We can create classes as blueprints with all the necessary information we expect EVERY object from that class to get

    First thing I'll create are FIELDS which are similar to properties of the object. We create these just like regular
    variables from yesterday only we do necessarily have to give them a value.

    Fields we might want for a person class:
    Name --> String
    Height --> double
    Weight --> double
    Age --> integer

    We'll declare these fields or properties at the class level OUTSIDE any method
     */

    String name;
    double height;
    double weight;
    int age;

    /*
    Now everytime I create a person OBJECT they should have all these properties associated with them and depending on
    how the variable is accessible I should be able to call the value by saying something like personObject.field
     */

    // I'm going to create a constructor for this class
    // Constructors are basically special methods with the same name as the class itself and provides a simple way
    // to set the state of the object upon creation(instantiation)

    public Person(String name, double height, double weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;

    }

    public Person(){
        this.name = "James";
        this.height = 67;
        this.weight = 180;
        this.age = 34;
    }

    public Person(String name) {
        this.name = name;
        this.height = 67;
        this.weight = 180;
        this.age = 34;
    }



    public void walk(int distance){
        System.out.println(this.name + " walked a distance of " + distance + " feet");
    }

    public String talk(){
        return "Hi, my name is " + this.name;
    }
}
