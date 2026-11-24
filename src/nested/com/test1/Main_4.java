package nested.com.test1;

class Country{
    private static String name = "india";
    private String name2 = "unitedstates";

    static class State{
        Country cnt;

        public State(Country country){
            this.cnt = country;
        }
        void  getName(){
            System.out.println(name);
            System.out.println(cnt.name2);
        }
    }
}

public class Main_4 {
    public static void main(String[] args) {

        Country ct = new Country();
        Country.State state = new Country.State(ct);
        state.getName();

    }
}
