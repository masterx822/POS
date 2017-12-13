public class App {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruts",3,new CantFly());
        Bird bird = new Bird("Bob", 1,new ItFlys());

        System.out.println(dog);
        System.out.println(bird);
    }
}
