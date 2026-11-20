class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
//Create three classes: Animal, Dog and Puppy. Demonstrate multilevel inheritance.
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}
