package number0;

import java.util.Scanner;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку(будем считать, что это номер документа).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 */
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        if (!str.matches("(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}")){
            System.out.println("Неверный номер документа");
            return;
        }
        Methods.firstTask(str);
        Methods.secondTask(str);
        Methods.thirdTask(str);
        Methods.fourthTask(str);
        Methods.fifthTask(str);
        Methods.sixthTask(str);
        Methods.seventhTask(str);
    }
}
