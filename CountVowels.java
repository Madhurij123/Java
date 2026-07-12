package clg.dkte;

public class CountVowels {

    public static void main(String[] args) {

        String s = "Hello world";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = Character.toLowerCase(s.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}