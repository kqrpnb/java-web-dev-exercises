package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
//        return flavor1.getName().compareTo(flavor2.getName()); //sort by name
        int flavor1Allergens = flavor1.getAllergens().size();
        int flavor2Allergens = flavor2.getAllergens().size();
        return flavor2Allergens - flavor1Allergens;
    }
}
