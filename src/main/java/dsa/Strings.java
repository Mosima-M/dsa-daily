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

        for (char character : text.toLowerCase().toCharArray()) {
            if (character == 'a' ||
                    character == 'e' ||
                    character == 'i' ||
                    character == 'o' ||
                    character == 'u') {
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

    public static int countCharacter(String text, char target) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

}
