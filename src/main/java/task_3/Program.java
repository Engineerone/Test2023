package task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.print("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int max=i+1;
        i=1;
        rec(i,max);
    }

    static int rec(int i,int max) {
        int result = 0;
        if (i == max) return result;
        result = rec(i + 1,max);
           System.out.print(i + " ");
        return result;
    }
}


