import java.util.ArrayList;
import java.util.Scanner;

/**
 *   Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
public class Number2 {
    public static void main(String[] args) {
        String[] strings = new Scanner(System.in).nextLine().split(" ");
        if (strings.length == 0) return;

        String result = strings[0];
        for (String str: strings) {
            if (countDifferentCharacters(result) > countDifferentCharacters(str)){
                result = str;
            }
        }
        System.out.println("Слово, в котором число различных символов минимально: " + result);
    }
    public static int countDifferentCharacters(String str){
        ArrayList<Character> encounteredCharacters = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!encounteredCharacters.contains(str.charAt(i))){
                encounteredCharacters.add(str.charAt(i));
                result++;
            }
        }
        return result;
    }
}
