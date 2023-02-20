package task_2;


import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("Введите размер 1 массива:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Введите размер 2 массива:");
        int y = scanner.nextInt();
        int[][] a = new int[x][y];


        for (int q = 0; q < x; q++)
            for (int w = 0; w < y; w++) {
                int ch;
                Random random = new Random();
                ch = random.nextInt(100);
                if (ch%2!=0) a[q][w] = ch; else continue;
                System.out.println(a[q][w]);
            }

    }


}



