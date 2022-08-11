package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        garfield.noise();
        garfield.purr();
        garfield.setHungry(true);
        System.out.println(garfield.isTired());
        System.out.println(garfield.isHungry());

        Cat suki = new HouseCat("Suki",8);
        suki.noise();
        ((HouseCat) suki).isSatisfied();
    }
}
