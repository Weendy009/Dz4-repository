public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        cat.run(200);
        cat.swim(100);
        Dog dog = new Dog("Dog");
        dog.run(500);
        dog.swim(10);
        Animal animal = new Animal("Animal");
        animal.run(1000);
        animal.swim(1000);
        System.out.println(Animal.getCountAnimal());
    }
}
