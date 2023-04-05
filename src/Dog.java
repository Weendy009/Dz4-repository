public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.printf("%s не может пробежать такое расстояние. \n", super.getName());
        } else {
            System.out.printf("%s пробежал %d м. \n", super.getName(), distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.printf("%s проплыл %d м. \n", super.getName(), distance);
        } else {
            System.out.printf("%s не умеет плавать так далеко. \n", super.getName());
        }

    }
}
