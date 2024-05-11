package Lession.Lession2;

import java.io.File;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // String str = "";
        // for (int i = 0; i < 1_000_000; i++) {
        // str += "+";
        // }
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1_000_000; i++) {

        // sb.append("+");

        // ########################################### СТРОКИ

        // concat(): объединение строк
        // valueOf(): преобразует Object в строковое представление (завязан на
        // toString())
        // join(): объединяет набор строк в одну с учетом разделителя
        // charAt(): получение символа по индексу
        // indexOf(): первый индекс вхождения подстроки
        // lastIndexOf(): последний индекс вхождения подстроки
        // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с
        // подстроки
        // replace(): замена одной подстроки на другую
        // ###################Streambilder():################
        // trim(): удаляет начальные и конечные пробелы
        // substring(): возвращает подстроку, см.аргументы
        // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем
        // регистре
        // сompareTo(): сравнивает две строки
        // equals(): сравнивает строки с учетом регистра
        // equalsIgnoreCase(): сравнивает строки без учета регистра
        // regionMatches(): сравнивает подстроки в строках

        // ----------------------------------------------------------------

        // String[] name = { "C", "е", "р", "г", "е", "й" };
        // String sk = "СЕРГЕЙ КА.";
        // System.out.println(sk.toLowerCase()); // сергей ка.
        // System.out.println(String.join("", name)); // Cергей
        // System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // // C,е,р,г,е,й
        // System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));

        // Много изменений – String
        // Много преобразований – StringBuilder

        // ###############################FiLE#############################

        // File f1 = new File("file.txt"); - относительный путь
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); - абсолютный
        // путь

        // import java.io.File;
        // public class fileSystemDemo {
        // public static void main(String[] args) {
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println(f3.getAbsolutePath ());
        // // /Users/sk/vscode/java_projects/file.txt
        // // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
        // }
        // }
        // }

        // №№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№ Обработка ошибки

        // try {
        // Код, в котором может появиться ошибка
        // } catch (Exception e) {
        // Обработка, если ошибка случилась
        // }
        // finally {
        // Код, который выполнится в любом случае
        // }

        // Пример

        // import java.io.File;
        // public class tryDemo {
        // public static void main(String[] args) {
        // try {
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println("try");
        // } catch (Exception e) {
        // System.out.println("catch");
        // }
        // finally
        // { System.out.println("finally"); }
        // }
        // }

        // import java.io.File;
        // public class tryDemo {
        // public static void main(String[] args) {
        // try {
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File file = new File(pathFile);
        // if (file.createNewFile()) {
        // System.out.println("file.created");
        // }
        // else {
        // System.out.println("file.existed");
        // }
        // } catch (Exception e) {
        // System.out.println("catch");
        // } finally {
        // System.out.println("finally");

        // Работа с файловой системой

        // isHidden(): возвращает истину, если каталог или файл является скрытым
        // length(): возвращает размер файла в байтах
        // lastModified(): возвращает время последнего изменения файла или каталога
        // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        // listFiles(): возвращает массив файлов и подкаталогов, которые находятся
        // в определенном каталоге
        // mkdir(): создает новый каталог
        // renameTo(File dest): переименовывает файл или каталог
        // length(): возвращает размер файла в байтах
        // lastModified(): возвращает время последнего изменения
        // файла или каталога
        // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        // listFiles(): возвращает массив файлов и подкаталогов, которые
        // находятся в определенном каталоге
        // mkdir(): создает новый каталог
        // renameTo(File dest): переименовывает файл или каталог

        // №№№№№№№№№№№№№№№№№ ЛОГИРОВАНИЕ №№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№

        // Использование
        // logger = Logger.getLogger()
        // Уровни важности
        // INFO, DEBUG, ERROR, WARNING и др.
        // Вывод
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);
        // Формат вывода: структурированный, абы как*
        // XMLFormatter, SimpleFormatter

        // import java.util.logging.*;
        // public class Ex0043 {
        // public static void main(String[] args) {
        // Logger logger = Logger.getLogger(Ex0043.class.getName());
        // logger.setLevel(Level.INFO);
        // ConsoleHandler ch = new ConsoleHandler ();
        // FileHandler fh = new FileHandler("Log.txt");
        // logger.addHandler(ch);
        // logger.addHandler(fh);
        // SimpleFormatter sFormat = new SimpleFormatter ();
        // ch.setFormatter(sFormat);
        // fh.setFormatter(sFormat);
        // logger.log(Level.WARNING, "Тестовое логирование" );
        // logger.info("Тестовое логирование" );
    }
}
