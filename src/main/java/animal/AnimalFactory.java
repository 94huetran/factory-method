package animal;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new dog();
        } return new Cat();
    }
}
