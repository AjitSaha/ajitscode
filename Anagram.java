public class Anagram {
    public static void main(String[] args) {
        String a = "care";
        String b = "race";
        System.out.println(anagram(a, b) ? "angram" : "not angram");

    }

    public static boolean anagram(String a, String b) {
        int c = 0;
        int d = 0;
        for (int i = 0; i < a.length(); i++) {
            c += a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            d += b.charAt(i);
        }
        if (c == d)
            return true;
        else
            return false;
    }

}
