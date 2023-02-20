package task_8;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String filein = "c:\\temp\\boom.mp4";
        String fileout = "c:\\temp\\boom1.mp4";


        try (InputStream is = new FileInputStream(filein)) {
            int data;
            OutputStream os = new FileOutputStream(fileout);
            while (is.available() != 0) {
                data = is.read();
                os.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");

        } catch (IOException e) {
            System.out.println("Error");

