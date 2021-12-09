package java_prog.pr7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Переменная, записывающая введёные данные
        System.out.println("Enter cards of players with spaces:");

        System.out.print("player 1 -> "); //Ввод пяти кард первого игрока
        String[] first = scanner.nextLine().split(" ");

        System.out.print("player 2 -> "); //Ввод пяти кард второго игрока
        String[] second = scanner.nextLine().split(" ");

        System.out.println("\nTesting:"); //Вывод результатов тестирования (из различных структур данных)
        System.out.println("[Stack] -> " + StackSolution.getWinner(first, second));
        System.out.println("[Queue] -> " + QueueSolution.getWinner(first, second));
        System.out.println("[Dequeue] -> " + DequeSolution.getWinner(first, second));
        System.out.println("[DoubleList] -> " + DoubleListSolution.getWinner(first, second));
    }
}
