public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        System.out.println("Целые числа от 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Целые числа от 10 до 1");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Все четные числа от 0 до 17");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 4");
        System.out.println("Числа от 10 до -10 от большего к меньшему");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 8");
        int depositAmount = 0;
        int deposit = 29_000;
        for (int i = 1; i <= 12; i++) {
            depositAmount = depositAmount + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + depositAmount + " рублей.");
        }
        System.out.println();

        System.out.println("Задача 9");
        depositAmount = 0;
        deposit = 29_000;
        for (int i = 1; i <= 12; i++) {
            depositAmount = depositAmount + depositAmount/100;
            depositAmount = depositAmount + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + depositAmount + " рублей.");
        }
        System.out.println();

        System.out.println("Задача 10");
        int value;
        for (int i=1; i<=10; i++)
        {
            value=2*i;
            System.out.println("2*"+i+"="+value);
        }



        /*

         */
    }
}