/*
Animal Klasse ist die Mutterklasse von Dog und Bird. Der wichtigste teil der Klasse ist das Datenfeld flyable,
dieses ist vom Typ IFLys (Strategie Interface).
 */

public class Animal {
    private String name;
    private int age;
    private IFlys flyable;

    public Animal(String name, int age, IFlys flyable) {
        this.name = name;
        this.age = age;
        this.flyable = flyable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flyable=" + flyable.fly() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IFlys getFlyable() {
        return flyable;
    }

    public void setFlyable(IFlys flyable) {
        this.flyable = flyable;
    }
}
