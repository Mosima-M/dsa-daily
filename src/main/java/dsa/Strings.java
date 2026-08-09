package dsa;

public class Strings {

    public static String reverseString(String text){
        StringBuilder sb = new StringBuilder();
        String [] newText = text.split("");
        for(int i = text.length() - 1 ; i >=0; --i){
            sb.append(newText[i]);
        }
        return sb.toString();
    }

    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }
}
