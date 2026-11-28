package DI.pkg.com;

//depende
class Parent {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

class Child {
    private Parent parent;   // composition

    public Child(Parent parent) {
        this.parent = parent;
    }

    public String getThatData() {
        return this.parent.getMessage();
    }
}

public class Main_2 {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.setMessage("hi from parent...");

        Child c1 = new Child(p1);  //dependency injection
        var res = c1.getThatData();
        System.out.println(res);
    }
}
