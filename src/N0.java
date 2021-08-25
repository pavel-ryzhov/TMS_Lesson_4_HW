import java.util.Scanner;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку(будем считать, что это номер документа).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 */
public class N0 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        if (!str.matches("(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}")){
            System.out.println("Неверный номер документа");
            return;
        }
        firstTask(str);
        secondTask(str);
        thirdTask(str);
        fourthTask(str);
        fifthTask(str);
        sixthTask(str);
        seventhTask(str);
    }

    /**
     * Вывести на экран в одну строку два первых блока по 4 цифры
     */
    public static void firstTask(String input){
        System.out.println(input.substring(0, 4) + input.substring(9, 13));
    }
    /**
     * Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
     */
    public static void secondTask(String input){
        System.out.println(input.replaceAll("[a-zA-Z]", ""));
    }
    /**
     * Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
     */
    public static void thirdTask(String input){
        System.out.println((input.substring(5, 8) + "/" + input.substring(14, 17) + "/" + input.charAt(19) + "/" + input.charAt(21)).toLowerCase());
    }
    /**
     * Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
     */
    public static void fourthTask(String input){
        StringBuilder stringBuilder = new StringBuilder("\"Letters:");
        stringBuilder.append((input.substring(5, 8) + "/" + input.substring(14, 17) + "/" + input.charAt(19) + "/" + input.charAt(21)).toUpperCase()).append("\"");
        System.out.println(stringBuilder);
    }
    /**
     * Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
     */
    public static void fifthTask(String input){
        System.out.println("Номер документа содержит последовательность abc: " + input.toLowerCase().contains("abc"));
    }
    /**
     * Проверить начинается ли номер документа с последовательности 555.
     */
    public static void sixthTask(String input){
        System.out.println("Номер документа начинается с последовательности 555: " + input.startsWith("555"));
    }
    /**
     * Проверить заканчивается ли номер документа на последовательность 1a2b.
     */
    public static void seventhTask(String input){
        System.out.println("Номер документа заканчивается на последовательность 1a2b: " + input.endsWith("1a2b"));
    }

}
