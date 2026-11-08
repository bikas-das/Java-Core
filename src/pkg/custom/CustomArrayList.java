package pkg.custom;

import java.util.Arrays;

public class CustomArrayList {
    private String[] fruits = new String[2];

    public CustomArrayList() {
        fruits[0] = "apple";
        fruits[1] = "orange";
    }

    public String[] getFruits() {
        return fruits;
    }

    public void setFruits(String[] fruits) {
        this.fruits = fruits;
    }

    public void customAdd(String val) {
        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        fruits[fruits.length - 1] = val;
        setFruits((fruits));
    }

}
