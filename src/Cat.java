public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.printf("%s не может пробежать такое расстояние. \n", super.getName());
        } else {
            System.out.printf("%s пробежал %d м. \n", super.getName(), distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать. \n", super.getName());
    }

}
