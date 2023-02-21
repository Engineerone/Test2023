package task_8;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("Рабочая папка c:\\temp_task\\");
        System.out.print("Введите имя исходной дирктории:");
        Scanner scanner = new Scanner(System.in);
        String dirin = scanner.next();

        File filesinput = new File("c:\\temp_task\\" + dirin);
        if (!filesinput.exists())
            filesinput.mkdirs();


        filesinput = new File("c:\\temp_task\\" + dirin + "\\1.txt");

        try {
            if (filesinput.createNewFile())
                System.out.println("Файл создан");
            else System.out.println("Файл уже создан");
            FileWriter writer = new FileWriter(filesinput);
            writer.write("Test data");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.print("Введите имя конечной дирктории:");
        String dirout = scanner.next();

        File fileoutpath = new File("c:\\temp_task\\" + dirout);
        if (!fileoutpath.exists()) {
            fileoutpath.mkdirs();
        }

        String filein = "c:\\temp_task\\" + dirin + "\\1.txt";
        String fileout = "c:\\temp_task\\" + dirout + "\\2.txt";

        try (InputStream is = new FileInputStream(filein)) {
            int data;
            OutputStream os = new FileOutputStream(fileout);
            while (is.available() != 0) {
                data = is.read();
                os.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");

        } catch (IOException e) {
            System.out.println("IOException");

        }

    }
}