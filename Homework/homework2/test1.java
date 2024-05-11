package Homework.homework2;

public class test1 {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder(QUERY);
        String level1 = PARAMS.replace("{", "").replace("}", "").replace("\"", "");
        String name = level1.split(",")[0].split(":")[1];
        String country = level1.split(",")[1].split(":")[1];
        String city = level1.split(",")[2].split(":")[1];
        String age = level1.split(",")[3].split(":")[1];

        if (!name.equals("null")) {
            sb.append("name=").append("'").append(name).append("'");
        }
        if (!name.equals("null")) {
            sb.append(" and ");
        }

        if (!country.equals("null")) {
            sb.append("country=").append("'").append(country).append("'");
        }
        if (!country.equals("null")) {
            sb.append(" and ");
        }

        if (!city.equals("null")) {
            sb.append("city=").append("'").append(city).append("'");
        }
        // if (!city.equals("null")) {
        // sb.append(" and ");
        // }

        // if (!age.equals("null")) {
        // sb.append("age=").append("'").append(age).append("'");
        // }
        // if (!age.equals("null")) {
        // sb.append("");
        // }

        return sb;

    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer {
        /**
         * @param args
         */
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
            } else {
                QUERY = args[0];
                PARAMS = args[1];
            }

            test1 ans = new test1();
            System.out.println(ans.answer(QUERY, PARAMS));
        }

    }
}
