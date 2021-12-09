package java_prog.pr12;

import java.util.Scanner;

public class TestINN {
    public static void main(String[] args) //Функция main
    {
        Scanner scanner = new Scanner(System.in); //Инициализация переменной ввода

        System.out.print("FIO: "); //Ввод ФИО
        String name = scanner.nextLine();

        while (true) {
            System.out.print("INN: "); //Ввод ИНН
            String INN = scanner.nextLine();
            try {
                checkINN(INN); //Если ИНН некорректен, то программа выдаст ошибку
                System.out.println("Valid"); //Выход из цикла
                return;
            } catch (INNException ex) //Выводим сообщения об ошибке
            {
                System.out.println("Not valid");
                System.out.println(ex.toString());
                System.out.println("Try again");
            }
        }
    }

    static void checkINN(String INN) throws INNException {
        //Неверная длина ИНН:
        if (INN.length() != 12)
            throw new INNException("Ошибка! Введите 12 цифр");
        //Если ИНН содержит символы отличные от цифр:
        else
            for (int i = 0; i < INN.length(); i++)
                if ((int)INN.charAt(i) < 48 || (int)INN.charAt(i) > 57)
                    throw new INNException("Введены неверные символы");
    }
}