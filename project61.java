import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Meow!");
    }
}

public class project61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the dog: ");
        String dogName = scanner.nextLine();
        Dog myDog = new Dog(dogName);

        System.out.print("Enter the name of the cat: ");
        String catName = scanner.nextLine();
        Cat myCat = new Cat(catName);

        System.out.println("My pets:");

        System.out.print("Dog: ");
        myDog.makeSound();

        System.out.print("Cat: ");
        myCat.makeSound();

        // Simulate an error and handle it
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}
