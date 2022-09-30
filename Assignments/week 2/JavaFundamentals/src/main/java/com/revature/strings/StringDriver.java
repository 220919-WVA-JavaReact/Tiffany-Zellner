package com.revature.strings;

public class StringDriver {
    public static void main(String[] args) {

        String text = "This is a string";

        String text2 = new String("This is also a string");

        String helloWorld = "Hello";

        helloWorld += " world";

        System.out.println(helloWorld);
        helloWorld = addOn(helloWorld);
        System.out.println(helloWorld);
        System.out.println(isEven(helloWorld));
        String tiffany = new String("My name is Tiffany");
        System.out.println(repeatSpace(tiffany, 3));
    }
    public static String addOn(String text){
        return text + " Adding onto the end";
    }

    public static boolean isEven(String text) {
        if (text.length() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static String repeatSpace(String text, int count){
        String s = new String("");
        for (int i = 0; i < count; i++){
            s += text;
            s += " ";
        }

        return s;
    }
}
