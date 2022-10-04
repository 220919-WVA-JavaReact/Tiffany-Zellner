package com.revature.arraylist;

import java.util.List;

public class ArrayList {
        /*
        Below is a list of exercises to help you get familiar with working with the ArrayList Collection
         */
        public static void main(String[] args) {

            // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
                List<String> colors = new java.util.ArrayList<>();
                colors.add(new String("blue"));
                colors.add(new String("red"));
                colors.add(new String("green"));
                colors.add(new String("orange"));

                for(int i = 0; i < colors.size(); i++) {
                        System.out.println(colors.get(i));
                }


            // 2. Write a Java program to iterate through all elements in an array list



            // 3. Write a Java program to insert an element into the array list at the first position



            // 4. Write a Java program to retrieve an element (at a specified index) from a given array list



            // 5. Write a Java program to remove the third element from an array list.



            // 6. Write a Java program to search an element in an array list.



            // 7. Write a Java program to sort a given array list.



        }
}
