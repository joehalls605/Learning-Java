/*
Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
The method in the subclass should have the same name, return type, and parameters.
Used to achieve runtime polymorphism.
*/

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}