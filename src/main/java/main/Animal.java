package main;

public class Animal {
    String species;
    String name;
    int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return species + ": " + name + ", " + age + " vuotta";
    }

    public void run() {
        System.out.println(name + " juoksee kovaa vauhtia!");
    }
}
