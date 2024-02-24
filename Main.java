// // Parent class
// class Animal {
//     String species;
//     String habitat;

//     Animal(String species, String habitat) {
//         this.species = species;
//         this.habitat = habitat;
//     }

//     void sleep() {
//         System.out.println(species + " is sleeping like a animal");
//     }

//     void eat() {
//         System.out.println(species + " is eating like a animal");
//     }
// }

// class Mammal extends Animal {
//     int numberOfLegs;
//     String sound;

//     Mammal(String species, String habitat, int numberOfLegs, String sound) {
//         super(species, habitat);
//         this.numberOfLegs = numberOfLegs;
//         this.sound = sound;
//     }

//     void sleep() {
//         System.out.println(species + " is sleeping like a mammal");

//     }

//     void eat() {
//         System.out.println(species + " eats dog food");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         Mammal dog = new Mammal("Dog", "Land", 4, "Bark");
//         dog.sleep();
//         dog.eat();
//         System.out.println(a += 10);
//         System.out.println("Mammal:");
//         System.out.println("Species: " + dog.species);
//         System.out.println("Habitat: " + dog.habitat);
//         System.out.println("Number of Legs: " + dog.numberOfLegs);
//         System.out.println("Sound: " + dog.sound);
//         System.out.println();

//     }
// }
