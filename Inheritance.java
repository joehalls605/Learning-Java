class Animal {
    void eat(){
        System.out.println("animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking")
    }
    Dog(){
        eat();
    }
}