import java.time.LocalTime;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
        System.out.println("hello world");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine();
        System.out.println("Hello, " + name);
        Depends(name);
    }

    public static void Depends(String name) {
        LocalTime It = LocalTime.now();

        if (It.getHour() > 18 && It.getMinute() < 23) {
            System.out.printf("GoodEvening: , %s!\n", name);
        } else if (It.getHour() >= 23 || It.getHour() < 5) {
            System.out.printf("Goodnight: , %s!\n", name);
        } else if (It.getHour() >= 5 || It.getHour() < 12) {
            System.out.printf("Goodmoning: , %s!\n", name);
        } else if (It.getHour() >= 12 || It.getHour() < 18) {
            System.out.printf("Goodday: , %s!\n", name);
        }
    }

}
