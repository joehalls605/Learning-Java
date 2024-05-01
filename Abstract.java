// Abstract class sets out a blue print to be followed. But it is not mandatory to set-up the draw function in the circle class.

abstract class Shape {
    abstract void draw(); // Abstract method states a blue print
    void display() {
        System.out.println("Shape is displayed"); // Non-abstract method
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle is drawn");
    }
}