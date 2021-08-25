import java.util.Scanner;

/**
 *   Дана строка произвольной длины с произвольными словами.
 *   Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
 *   Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке палиндромом.
 *   Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.
 */
public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        if (strings.length == 0){
            System.out.println("Ничего не введено");
            return;
        }
        int word = scanner.nextInt();
        if (word >= strings.length){
            System.out.println("Введён неверный индекс слова");
            return;
        }
        System.out.printf("Выбранное слово в строке%s является палиндромом", isPalindrome(strings[word]) ? "" : " не");
    }
    public static boolean isPalindrome(String str){
        String string = str.substring(0, Math.round(str.length() / 2f));
        return str.endsWith(new StringBuilder(string).reverse().toString());
    }
}
