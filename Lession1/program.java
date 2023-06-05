/**
 * program
 */
public class program { // в качесто
    public static void main(String[] args) {
        System.out.println("world"); // или написать  sysout = он выведет все сам.
        System.out.println(Integer.MAX_VALUE); // 
        String s = "qwert";
        s.charAt(1);

    }
    
}
//  вывести в терминале можно командой java *название файла* без расширения

// Типы данных - ссылочные и примитивные (bolean, int, long, float, double, char)
// Создание переменной <тип> <идентификатор> = <значение>, нужно обязательно давать начальное значение
        float  e = 2.7f; 
        double r = 3.1445;
        char ch = '{'; // хранится символ...
        int i = 12; // можно разделять разряды 12_123_12
        double d = i;
        boolean f = true && false; // & - по битовая операция ^ - возвращает истину только тогда когда только одно из значений истинно   
        String s = new String("fdsfsg"); 
// неявная типизация
        var ir  = 1213; // если не знаешь какая переменная то ставь var


// метод для определения типа
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
// использование обертки int = Integer, Char = Character и т.д

// операции java

    int d = 123;
    d ++;
    System.out.println(d++); // нужно инкремент писать ранее по коду иначе не выполнется
    System.out.println(++d); // приоритет выше чем у вывода в печать.
    System.out.println(d);
// побитовый сдвиг

    int s = 8;
    // 1000
    //a = a << 1; 
    System.out.println(a << 1);
    // 10000

// побитовые операции

    int as = 2;
    int sds = 5;
    System.out.println(as | sds);
    String sar = "qwerty"; 
    boolean b = sar.length() > 5 && sar.charAt(4) = '1';
    boolean v = true;
    System.out.println(b && v ); // быстрая операция проверяет если одно истинно, то истинно, а операция & смотрит на каждую переменную
// массив

public class program { // в качесто
    public static void main(String[] args) {
      
        int[] arr = new int[10]; // можно иницилизировать самим int[] = new int[] {1,2,24,4,8,16,};
        arr[3] = 13;
        System.out.println(arr[3]);
    }
    
}