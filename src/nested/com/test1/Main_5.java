package nested.com.test1;

class Outer{
    private int a = 5;

    class Inner{
        private int a = 10;
        void display(){
            System.out.println(a);
            System.out.println(Outer.this.a);
        }
    }
}
public class Main_5 {
    public static void main(String[] args) {

         Outer out = new Outer();
         Outer.Inner in = out.new Inner();
         in.display();
    }
}
