package bt1;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("Canie");
        System.out.println("Dog " + a1.makeSound());
        Animal a2 = animalFactory.getAnimal("Filine");
        System.out.println("Cat " + a2.makeSound());
    }
}
