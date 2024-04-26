// /**
//  * program
//  */
// public class program { // в качесто 
//     public static void main(String[] args) { // базовая единица является класс в котором есть один метод(который обязательно называется main)
//         System.out.println("world"); // или написать  sysout = он выведет все сам.
//         System.out.println(Integer.MAX_VALUE); // 
//         String s = "qwert";
//         s.charAt(1);

//     } 

// }
// //  вывести в терминале можно командой java *название файла* без расширения



// // Типы данных - ссылочные (классы и интерфейсы) и примитивные (bolean, int, long, float, double, char)
// // Создание переменной <тип> <идентификатор> = <значение>, нужно обязательно давать начальное значение, 
//         float  e = 2.7f;  // вещественное число, обязательно использовать суффикс F
//         double r = 3.1445; // вещественное число, есть тоже суффикс D, но он не обязателен.
//         char ch = '{'; // хранится символ...опеределяет отдельный символ. используется для неявного преобразования, пример ch = 123 выведет  также "{"
//         int i = 12; // можно разделять разряды 12_123_12, занимает 4 байта. Можно значение int положить в double, int f = 12; double g = f;
//         double d = i;
//         boolean f = true && false; // & или | - по битовая операция ^ - возвращает истину только тогда когда только одно из значений истинно   
//             // ^ - разделительная дизюнкция (возвращает истину если одно значение истинное)
//         String s = new String("fdsfsg"); // можно место значения поставить null (пустая ссылка), если мы не положили значение в переменную которую будете использовать то, программа не скомпелируется. Т.к. переменная не определена конкретным значением
//            // длина строки s.length()
//            // вызов конкретного символа строки s.charAt(index)
// // неявная типизация
//         var ir  = 1213; // если не знаешь какая переменная то ставь var 

//  // с маленькой буквы приметивный тип int-32, long-64, float-64, double-64, short-16, byte-, boolean, char
// // метод для определения типа
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }
// // использование обертки int = Integer, Char = Character и т.д


// Примитив обертка
// int        Integer
// Char       Character

// // на примитиве нельзя выбрать свойство int.max_Value = неверно, Integer.Max_Value = верно. Обертка все с большой буквы


// // операции java

//     int d = 123;
//     d ++;
//     System.out.println(d++); // нужно инкремент писать ранее по коду иначе не выполнется постфиксный инкримент
//     System.out.println(++d); // приоритет выше чем у вывода в печать. Префиксный инкримент
//     System.out.println(d);
// // операции сравнения

// <>,==, !=, >=, <=

//     // побитовый сдвиг

//     int s = 8;
//     // 1000
//     //a = a << 1; 
//     System.out.println(a << 1);
//     // 10000

// // побитовые операции

//     int as = 2;
//     int sds = 5;
//     System.out.println(as | sds); // 2 или 5 будет 7, (as ^ sds) - 
//     String sar = "qwerty"; // 0...4
//     boolean b = sar.length() > 5 && sar.charAt(4) = '1';
//     boolean v = true;
//     System.out.println(b && v ); // быстрая операция проверяет если одно истинно, то истинно, 
//     System.out.println(b & v ); // а операция & смотрит на каждую переменную, и если первая истинно, то все равно проверяет вторую переменную
//     System.out.println(b || v ); // Если одна истинно, то вторую не смотрим ????

// // массив

// public class program { // в качесто
//     public static void main(String[] args) {
      
//         int[] arr = new int[10]; // можно иницилизировать самим int[] = new int[] {1,2,24,4,8,16,};
//         arr[3] = 13;
//         System.out.println(arr[3]);
//     }
    
// }

// public class program { // в качесто
//     public static void main(String[] args) {
      
//         arr =  new int [] {1,2,3}    // можно записать int arr[]; или  int[] arr;
    
// }
// // многомерный массив
// public class Program {
//     public static void main(String[] args) {
//     int[][] arr = new int[3][5];
   
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//          System.out.printf("%d ", arr[i][j]);
//     }
//     System.out.println();

// // преобразование

// public class Program {
//     public static void main(String[] args) {
//     int i = 123; double d = i;
//     System.out.println(i); // 123
//     System.out.println(d); // 123.0
//     d = 3.1415; i = (int)d;
//     System.out.println(d); // 3.1415
//     System.out.println(i); // 3
//     d = 3.9415; i = (int)d;
//     System.out.println(d); // 3.9415
//     System.out.println(i); // 3
//     byte b = Byte.parseByte("123");
//     System.out.println(b); // 123
//     b = Byte.parseByte("1234"); // будет переполнение т.к. байт с 0 до 255
//     System.out.println(b); // NumberFormatException: Value out of range
//     }
//    }

//    class Program
// {
//  public static void main(String[] args) {
//  int[] a = new int[10];
//  double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность - работать не будет, нужно использовать метод
//  }
// }

// // получение данных из терминала

// import java.util.Scanner;
// public class program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in); //  определяем класс сканер
//  System.out.printf("name: ");
//  String name = iScanner.nextLine();
//  System.out.printf("Привет, %s!", name);
//  iScanner.close();
//  }
// }

// // получение примитивов

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  int x = iScanner.nextInt();
//  System.out.printf("double a: ");
//  double y = iScanner.nextDouble();
//  System.out.printf("%d + %f = %f", x, y, x + y);
//  iScanner.close();

//  // проверка на соответствие получаемого типа

//  import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  boolean flag = iScanner.hasNextInt();
//  System.out.println(flag);
//  int i = iScanner.nextInt();
//  System.out.println(i);
//  iScanner.close();
//  } }

//  // конкатинация

//  public class Program {
//     public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = a + " + " + b + " = " + c;
//     System.out.println(res);
//     }
//    }
//  // форматируемый вывод
//    public class Program {
//     public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = String.format("%d + %d = %d \n", a, b, c); // вместо %d ставиться переменная обозначенная через запятую слева на право
//     System.out.printf("%d + %d = %d \n", a, b, c);
//     System.out.println(res);
//     }
//    }

// //    %d: целочисленных значений
// // %x: для вывода шестнадцатеричных чисел
// // %f: для вывода чисел с плавающей точкой
// // %e: для вывода чисел в экспоненциальной форме,
// // например, 3.1415e+01
// // %c: для вывода одиночного символа
// // %s: для вывода строковых значений

// // Виды спецификаторов

// public class Program {
//     public static void main(String[] args) {
   
//     float pi = 3.1415f;
//     System.out.printf("%f\n", pi); // 3,141500
//     System.out.printf("%.2f\n", pi); // 3,14
//     System.out.printf("%.3f\n", pi); // 3,141
//     System.out.printf("%e\n", pi); // 3,141500e+00
//     System.out.printf("%.2e\n", pi); // 3,14e+00
//     System.out.printf("%.3e\n", pi); // 3,141e+00
//     }
//    }

//    // область видимости переменных

//    public class Program {
//     public static void main(String[] args) {
//        {
//         int i = 123; // переменная определенная внутри блока не существует за ее пределами.
//         System.out.println(i);
//        }
//         System.out.println(i); // error: cannot find symbol
//     }
//    }
// // функции  и методы

// public class Program {
//     static void sayHi() {
//     System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//     return a+b;
//     }
//     static double factor(int n) { // рекурсия
//     if(n==1)return 1;
//     return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//     sayHi(); // hi!
//     System.out.println(sum(1, 3)); // 4
//     System.out.println(factor(5)); // 120.0
//     }}
   
//     // управляющие конструкции 

//     public class Program {
//         public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//         }
//        }

//        // тернарный оператор

//        public class Program {
//         public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b; // Если а меньше б то вернется после ? до : если наоборот то после :
//         System.out.println(min);
//         }
//        }

//        // оператор выбора

//        import java.util.Scanner;
       
//        public class program {
//            public static void main (String[] args) {
//                 int mounth = Value;
//                 String text = "";
//                 swich (mounth) {
//                     case 1: // проверка если равно 1
//                        text = "fdfdfd";
//                        break;
//                     ...
//                     case 1: // если равно 1 то далее проваливается в проверку 2 и так далее  
//                     case 2:
//                     case 3:
//                     case 4:


//                     default: // не обезательное условие, если 
//                        text = "mistake"
//                        break;
//                 }
//             system.out.println(text);
//             iScanner.close(); 
//             }

        
//        }


// // Циклы while
// public class Program {
//     public static void main(String[] args) {
//     int value = 321;
//     int count = 0;
//     while (value != 0) {
//     value /= 10;
//     count++;
//     }
//     System.out.println(count);
//     }
//    }

//    Цикл do while
// public class Program {
//  public static void main(String[] args) {
//  int value = 321;
//  int count = 0;
//  do {
//  value /= 10;
//  count++;
//  } while (value != 0);
//  System.out.println(count);
//  }
// }
// Оператор цикла for
// public class Program {
//  public static void main(String[] args) {
//  int s = 0;
//  for (int i = 1; i <= 10; i++) {
//  s += i;
//  }
//  System.out.p
//    // вложенные циклы
//    public class Program {
//     public static void main(String[] args) {
//     for (int i = 0; i < 5; i++) {
//     for (int j = 0; j < 5; j++) {
//     System.out.print("* ");
//     }
//     System.out.println();
//    // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
//  // циклы для коллекций   
//  for :
//     public class Program {
//      public static void main(String[] args) {
//      int arr[] = new int[10];
//      for (int item : arr) {
//      System.out.printf("%d ", item);
//      }
//      System.out.println();
//      }
//     }

// // работа с файлами

// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//  public static void main(String[] args) {
//  try (FileWriter fw = new FileWriter("file.txt", false)) {
//  fw.write("line 1");
//  fw.append('\n');
//  fw.append('2');
//  fw.append('\n');
//  fw.write("line 3");
//  fw.flush();
//  } catch (IOException ex) {
//  System.out.println(ex.getMessage());
//  }
//  } }


// // работа с файлами, вариант по символьно

//  import java.io.*;
// public class Program {
//  public static void main(String[] args) throws Exception {
//  FileReader fr = new FileReader("file.txt");
//  int c;
//  while ((c = fr.read()) != -1) {
//  char ch = (char) c;
//  if (ch == '\n') {
//  System.out.print(ch);
//  } else {
//  System.out.print(ch);
//  }
//  }
//  } }

//  // вариант по строчно

//  import java.io.*;
// public class Program {
//  public static void main(String[] args) throws Exception {
//  BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//  String str;
//  while ((str = br.readLine()) != null) {
//  System.out.printf("== %s ==\n", str);
//  }
//  br.close();
//  }
// }