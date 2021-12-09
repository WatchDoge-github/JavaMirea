package java_prog.pr7;

import java.util.Stack;

public class StackSolution {
    private static Stack<Integer> firstPlayerDeck; //Переменные колод первого игрока
    private static Stack<Integer> secondPlayerDeck; //Переменные колод второго игрока

    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) //Метод определения победителя
    {
        //Инициализация переменных:
        StackSolution.firstPlayerDeck = new Stack<>();
        StackSolution.secondPlayerDeck = new Stack<>();

        //Данные о колодах в коллекции:
        for (int i = 4; i >= 0; i--) {
            StackSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            StackSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            //Если у первого игрока закончились карты, то второй побеждает. Если у второго игрока закончились карты, то первый побеждает. В ином случае выводится старшая карта.
            if (StackSolution.firstPlayerDeck.size() == 0)
                return "second " + i;
            else if (StackSolution.secondPlayerDeck.size() == 0)
                return "first " + i;
            else {
                int firstCard = StackSolution.firstPlayerDeck.pop(); //"Вынимаем" карты из колоды первого игрока
                int secondCard = StackSolution.secondPlayerDeck.pop(); //"Вынимаем" карты из колоды второго игрока

                if (firstCard == 0 && secondCard == 9) //Побеждает ли первая карта "0" вторую карту "9"?
                {
                    StackSolution.firstPlayerDeck.add(0, firstCard);
                    StackSolution.firstPlayerDeck.add(0, secondCard);
                }
                else if (secondCard == 0 && firstCard == 9) //Побеждает ли вторая карта "0" первую карту "9"?
                {
                    StackSolution.secondPlayerDeck.add(0, firstCard);
                    StackSolution.secondPlayerDeck.add(0, secondCard);
                }
                else if(firstCard > secondCard) //В ином случае побеждает большая карта
                {
                    StackSolution.firstPlayerDeck.add(0, firstCard);
                    StackSolution.firstPlayerDeck.add(0, secondCard);
                }
                else {
                    StackSolution.secondPlayerDeck.add(0, firstCard);
                    StackSolution.secondPlayerDeck.add(0, secondCard);
                }
            }
        }
        return "botva"; //Если после 106 ходов игра не заканчивается, программа выводит слово botva
    }
}
