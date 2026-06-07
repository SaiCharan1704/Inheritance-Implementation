package Week2;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class InheritanceImplementation {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog("Buddy", 3, "Labrador"),
            new Cat("Kitty", 2, "White")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
