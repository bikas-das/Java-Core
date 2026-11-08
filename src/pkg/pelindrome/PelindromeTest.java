package pkg.pelindrome;

public class PelindromeTest {

    public static boolean calc(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {

        var res = calc("mom");
//        var res = calc("dad");

        System.out.println(res);
    }
}
