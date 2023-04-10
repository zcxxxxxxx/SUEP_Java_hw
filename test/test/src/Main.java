class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat {
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
    }
}
