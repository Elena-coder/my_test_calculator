package testpackage.lesson_1.i_study_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Добрый день, как Вас зовут?");

        String name = scanner.nextLine();
        System.out.println(name + "...");
        System.out.println("Очень приятно, " + name + "! А я - калькулятор))) Предлагаю что-нибудь посчитать!");
        System.out.println("Только сначала сделай важный выбор: введи 1, 2 или ничего (в этом случае просто нажми Enter).");
        System.out.println("Но учти, в третьем случае я закроюсь и мы совсем не пообщаемся(((");*/
        System.out.println("Введи 1, 2 или ничего");
        String number = scanner.nextLine();
        while (!number.isEmpty()) {
            if (number.equals("1")) {
                window1 win1 = new window1();
                win1.setVisible(true);
                System.out.println("О, прекрасный выбор!\n" +
                        "Если не видно всплывающего окна, значит нужно нажать значок Java, который замаячил внизу.\n"+
                        "Для интереса введи теперь цифру 2.");
                number = scanner.nextLine();
                continue;
            } else if (number.equals("2")) {
                window2 win2 = new window2();
                window1 win1 = new window1();
                win1.setVisible(false);
                win1.dispose();
                System.out.println("Отлично! \n" +
                        "Если не видно всплывающего окна, значит нужно нажать значок Java, который замаячил внизу.\n"+
                        "Попробуй теперь ввести цифру 1.\nНо помни, что можно просто нажать Enter и мы расстанемся.");
                number = scanner.nextLine();
                continue;
            } else if ((!number.equals("1")) && (!number.equals("2"))) {
                System.out.println("Давай, как-то будем следовать предложенным вариантам.\nВведи 1 или 2, ну или ничего, если не хочешь общаться.");
                number = scanner.nextLine();
                continue;
            }

        }  // while cycle
        System.exit(0);
    }  // method main
} // class Main
