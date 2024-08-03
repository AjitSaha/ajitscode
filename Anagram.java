public class Anagram {
    public static void main(String[] args) {

        int input = 10;
        System.out.println(anagram(input));

    }

    public static String anagram(int a) {

        String s = "";
        while (a > 0) {
            int r = a % 2;
            s = r+s;
            a /= 2;

        }
        return s;
    }

}
