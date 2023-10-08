package Sep23.inheritence.mutlilevel;

//Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.

public class Animal {
   public static void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    public static void makeSound() {
        System.out.println("The Cat Quarrels");
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();

    }
}