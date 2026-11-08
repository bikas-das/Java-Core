package pkg.custom;

public class Custom_ArrayList {

    public static void main(String[] args) {

        CustomArrayList arr = new CustomArrayList();
        arr.customAdd("banana");
        arr.customAdd("strawberry");

        for (String str : arr.getFruits()) {
            System.out.println(str);
        }
    }
}
