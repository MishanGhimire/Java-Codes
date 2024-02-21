class Animal {
    String species;
    String habitat;

    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }
}

class Mammal extends Animal {
    int numberOfLegs;

    public Mammal(String species, String habitat, int numberOfLegs) {

        super(species, habitat);
        this.numberOfLegs = numberOfLegs;
    }
}

public class Main {
    public static void main(String[] args) {

        Mammal dog = new Mammal("Dog", "Ground", 4);

        System.out.println("Species: " + dog.species);
        System.out.println("Habitat: " + dog.habitat);
        System.out.println("Number of Legs: " + dog.numberOfLegs);
    }
}
