package task_4;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String i;
        do {
            System.out.print("Введите слово на букву А(eng):");
            Scanner scanner = new Scanner(System.in);
            i = scanner.next();
        }
        while (!i.startsWith("A"));
        System.out.println("Thanks !");
    }

}
