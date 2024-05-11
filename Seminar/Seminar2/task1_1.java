package Seminar.Seminar2;

// вариант препода
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task1_1 {
    private static Logger LOGGER = log.log(task1_1.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Приложение стартовало");
        String out = "C:\\Users\\lexle\\Downloads";
        writeFileNamesInFile("task1.txt", out);
    }

    private static void writeFileNamesInFile(String in, String out) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(in);
            if (isThrowException()) {
                LOGGER.log(Level.SEVERE, "Возникла ошибка в методе записи: Тут должно быть ее подробное описание");
                // throw new RuntimeException("Возникла ошибка в методе записи: Тут должно быть
                // ее подробное описание");
            }
            String[] arr = readFileNamesInDir(out);
            for (String s : arr) {
                fw.write(s + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
                throw new RuntimeException("Error closing file", e);
            }
        }
    }

    private static String[] readFileNamesInDir(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            if (isThrowException()) {
                LOGGER.log(Level.SEVERE, "Возникла ошибка в методе чтения: Тут должно быть ее подробное описание");
                // throw new RuntimeException("Возникла ошибка в методе чтения: Тут должно быть
                // ее подробное описание");
            }
            File[] files = file.listFiles();
            String[] names = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                names[i] = files[i].getName();
            }
            return names;
        } else {
            throw new RuntimeException("File is not a directory");
        }
    }

    private static boolean isThrowException() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}

// Александр Леонидов
// import java.io.FileInputStream;
// import java.util.logging.LogManager;
// import java.util.logging.Logger;

// public class Log {
// static {

// try (FileInputStream in = new FileInputStream("log.config")) { //
// относительный путь до файла с конфигами
// LogManager.getLogManager().readConfiguration(in);
// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// public static Logger log(String className) {
// return Logger.getLogger(className);
// }
// }
