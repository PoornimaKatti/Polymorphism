
package polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Using polymorphism to call makeSound on different objects
        makeAnimalSound(a);
        makeAnimalSound(dog);
        makeAnimalSound(cat);

      
        fetchByDog(dog);
        scratchByCat(cat);
    }

   
    private static void makeAnimalSound(Animal animal) {
        animal.makeAnimalSound();
    }

    
    private static void fetchByDog(Dog dog) {
        dog.fetch();
    }

   
    private static void scratchByCat(Cat cat) {
        cat.scratch();
    }
}