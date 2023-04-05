public class Animal {
    private final String name;
    private static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public void run(int distance) {
        System.out.printf("%s пробежал %d м. \n", name, distance);
    }

    public void swim(int distance) {
        System.out.printf("%s проплыл %d м. \n", name, distance);
    }

    public String getName() {
        return name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
