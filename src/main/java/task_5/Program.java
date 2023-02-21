package task_5;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time;
        do {
            System.out.print("Введите текущий час:");
            time = scanner.nextInt();
        }
        while (time > 24);
        System.out.print("Введите ваше имя:");
        String name = scanner.next();

        if ((time >= 6) & (time < 11))
            System.out.println("Доброе утро " + name);
        else if ((time >= 11) & (time < 17))
            System.out.println("Добрый день " + name);
        else if ((time >= 17) & (time < 22))
            System.out.println("Добрый вечер " + name);
        else
            System.out.println("Доброй ночи " + name);
    }
}

