package bt1;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if("Canie".equals(type)){
            return new Dog();
        }
        return new Cat();
    }
}
