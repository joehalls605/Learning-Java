/*
A design principle where one class contains a reference to another class.
Represents a "has-a" relationship.
It is used to build complex types by combining objects of other types.
Example:

*/

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
    }
}
