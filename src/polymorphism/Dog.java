
package polymorphism;

class Dog extends Animal {
   
    public void makeAnimalSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}