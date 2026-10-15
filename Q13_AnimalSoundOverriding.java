class Animal {
    void makeSound() { System.out.println("Animal makes a sound."); }
}
class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Dog says: Woof Woof!"); }
}
class Cat extends Animal {
    @Override
    void makeSound() { System.out.println("Cat says: Meow!"); }
}
public class Q13_AnimalSoundOverriding {
    public static void main(String[] args) {
        Animal a = new Animal(); Animal d = new Dog(); Animal c = new Cat();
        a.makeSound(); d.makeSound(); c.makeSound();
    }
}
