package Seminar.Seminar2; // API - application programming interfaces

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task1 {
    // public static void main(String[] args) {

    // }
    private static Logger LOGGER = log.log(task1.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Приложение стартовало");
        String out = "D:\\1";
        System.out.println(Arrays.toString(readFileNamesInDir("D:\\1\\")));
        writeFileNamesInFile("task1.txt", out);
    }

    // public static void readFileNames(String path) {
    // FileReader reader = null;
    // try {
    // File file = new File(path);
    // if (file.isDirectory()) {
    // reader = new FileReader(file);
    // File[] arrFiles = file.listFiles();
    // for (File elem : arrFiles) {
    // System.out.println(elem.getName());
    // }
    // } else {
    // throw new IOException("Файл не является папкой");
    // }

    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // } finally {
    // try {
    // reader.close();
    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }
    // }
    public static void writeFileNamesInFile(String in, String out) {
        FileWriter fw = null;
        try {
            if (isThrowException()) {
                LOGGER.log(Level.SEVERE, "Возникла ошибка в методе записи: Тут должно быть ее подробное описание");
                throw new RuntimeException("Возникла ошибка в методе записи: Тут должно быть ее подробное описание");
            }
            fw = new FileWriter(in);
            String[] arr = readFileNamesInDir(out);
            for (String s : arr) {
                fw.write(s + "\n'");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException("Error closing file");
            }
        }
    }

    public static String[] readFileNamesInDir(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            if (isThrowException()) {
                LOGGER.log(Level.SEVERE, "Возникла ошибка в методе чтения: Тут должно быть ее подробное описание");
                throw new RuntimeException("Возникла ошибка в методе чтения: Тут должно быть ее подробное описание");
            }
            File[] Files = file.listFiles();
            String[] names = new String[Files.length];
            for (int i = 0; i < Files.length; i++) {
                names[i] = Files[i].getName();
            }
            return names;
        } else {
            throw new RuntimeException("File is not a directory");
        }

    }

    public static boolean isThrowException() {
        int a = 0;
        int b = 2;
        int digit = (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}
