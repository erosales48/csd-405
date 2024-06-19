package Examples;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myAnimal.makeSound();  // Outputs: Some sound
        myDog.makeSound();     // Outputs: Bark
        myCat.makeSound();     // Outputs: Meow
    }
}