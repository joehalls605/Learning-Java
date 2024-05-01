// Interface -  a interface is purely a blueprint, you obviously cannot make anything directly in the blueprint, but you can take the blueprint and use it in a different class to make something.

interface Animal {
    void eat(); 
    void sleep(); 
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}