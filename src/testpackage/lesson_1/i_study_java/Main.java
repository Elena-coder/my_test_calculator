package testpackage.lesson_1.i_study_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Добрый день, как Вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "...");
        System.out.println("Очень приятно, " + name + "! А я - калькулятор))) Предлагаю что-нибудь посчитать!");
        System.out.println("Только учтите: на ноль делить нельзя, дробные части нужно отделять запятой... ");
        System.out.println("... и да, я умею выполнять только 4 операции!");
        System.out.println("Введите номер операции");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        int operation = scanner.nextInt();
        System.out.println("О, прекрасный выбор! Введите первое число");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число");
        float b = scanner.nextFloat();
        float result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }


        System.out.println("Результат = " + result);

    }
}
