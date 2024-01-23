package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void runAnimals(int number) {
        for (Animal animal : animals) {
            for (int i = 0; i < number; i++) {
                animal.run();
            }
        }
    }
}
