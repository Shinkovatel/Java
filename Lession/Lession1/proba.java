/**
 * proba
 */
public class proba {
    public static void main(String[] args) { // базовая единица является класс в котором есть один метод(который обязательно называется main, в качестве аргумента принимает массив строк и в нем мы что то пишем)
        var f = 123;
        System.out.println(f);
        System.out.println(getType(f));

    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}