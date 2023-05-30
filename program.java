import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // Написать калькулятор в ООП стиле(инкапсуляция, наследованеи. полиморфизм)
        // 1 версия обычная с ипользованием объекта класса и имеющихся функций. Числа объявляем при объявлении переменной.
        Numbers a = new Numbers(5, 69);
        a.summation();
        a.subtraction();
        a.multiplication();
        a.division();

        // 2 версия для юзера, но использующая классы
        System.out.println("Введите первое число?");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.println("Введите что будем делать (складывать/вычитать/перемножать/делить? ");
        Scanner scanner1 = new Scanner(System.in);
        String op = scanner1.nextLine();

        System.out.println("Введите второе число?");
        double y = scanner.nextDouble();

        Numbers b = new Numbers(x, y);

        switch (op) {
            case "+":
                b.summation();
                break;
            case "-":
                b.subtraction();
                break;
            case "*":
                b.multiplication();
                break;
            case "/":
                b.division();
                break;
        }

    }

}
