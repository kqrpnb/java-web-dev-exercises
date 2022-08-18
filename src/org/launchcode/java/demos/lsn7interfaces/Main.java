package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());

        Iterator iterator=flavors.listIterator();
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        //TODO: Use a Comparator class to sort the 'toppings' array. bonus topping mission. 
        toppings.sort(new ToppingComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        System.out.println("\nFlavors: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator=cones.listIterator();

        System.out.println("\nCones: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator=toppings.listIterator();

        System.out.println("\nToppings: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
