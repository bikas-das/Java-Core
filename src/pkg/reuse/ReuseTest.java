package pkg.reuse;

public class ReuseTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("elephant");
        animal.setCanEat(true);
        System.out.println(animal.getName());
        System.out.println(animal.isCanEat());
        Dog d1 = new Dog();
        d1.setName("doggy");
        d1.setCanEat(true);
        d1.setCanBark(true);
        System.out.println("----------");
        System.out.println(d1.getName());
        System.out.println(d1.isCanEat());
        System.out.println(d1.isCanBark());

    }
}
