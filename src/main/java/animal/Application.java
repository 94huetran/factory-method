package animal;

public class Application {
    public static void main(String[] args) {
        AnimalFactory animal = new AnimalFactory();

        Animal a1 = animal.getAnimal("canine");
        System.out.println("Sound a1: "+a1.makeSound());

        Animal a2 = animal.getAnimal("feline");
        System.out.println("Sound a2: "+a2.makeSound());
    }
}
