package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if(animal.equals("Dog")) {
           String premiumDogOrNot = (isPremium == true) ? "Deluxe Dog Food" : "Dog Food";
           return premiumDogOrNot;
        } else if (animal.equals("Hamster")) {
            String premiumHamsterOrNot = (isPremium == true) ? "Lettuce" : "Cabbage";
            return premiumHamsterOrNot;
        }  else if (animal.equals("Cat")) {
            String premiumCatOrNot = (isPremium == true) ? "Salmon" : "Tuna";
            return premiumCatOrNot;
        } else {
            return "Unknown food";
        }
    }
}
