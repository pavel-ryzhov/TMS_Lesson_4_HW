import java.util.Scanner;

/**
 *   Дана строка произвольной длины с произвольными словами.
 *   Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */
public class N1 {
    public static void main(String[] args) {
        String[] strings = new Scanner(System.in).nextLine().split(" ");
        if (strings.length == 0) return;
        System.out.println("Самое короткое слово в строке: " + shortestWord(strings));
        System.out.println("Самое длинное слово в строке: " + longestWord(strings));
    }
    public static String longestWord(String[] strings){
        String longestWord = "";
        for (String str: strings){
            if (longestWord.length() <= str.length()) longestWord = str;
        }
        return longestWord;
    }
    public static String shortestWord(String[] strings){
        String longestWord = strings[0];
        for (String str: strings){
            if (longestWord.length() >= str.length()) longestWord = str;
        }
        return longestWord;
    }
}
