package pkg.reuse_super;

public class Dog extends  Animal{
    String color;


    public Dog(String color, String breed, String color1) {
        super(color, breed);;
        this.color = color1;
        System.out.println("dog constr called...");
    }

    void displayColor(){
        System.out.println("dog color: child " + color);
        System.out.println("breeed: " + breed);
        System.out.println("dog color: parent " + super.color);

    }

    @Override
    void eat() {
        System.out.println("chewing a bone.....");
    }

    void printActivity(){
        eat();
        super.eat();
    }
}
