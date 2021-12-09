package java_prog.pr7;

import java.util.LinkedList;

public class DoubleListSolution {
    private static LinkedList<Integer> firstPlayerDeck; //Переменные колод первого игрока
    private static LinkedList<Integer> secondPlayerDeck; //Переменные колод второго игрока

    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) //Метод определения победителя
    {
        //Инициализация переменных:
        DoubleListSolution.firstPlayerDeck = new LinkedList<>();
        DoubleListSolution.secondPlayerDeck = new LinkedList<>();

        //Данные о колодах в коллекции:
        for (int i = 0; i < 5; i++) {
            DoubleListSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            DoubleListSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            //Если у первого игрока закончились карты, то второй побеждает. Если у второго игрока закончились карты, то первый побеждает. В ином случае выводится старшая карта.
            if (DoubleListSolution.firstPlayerDeck.size() == 0)
                return "second " + i;
            else if (DoubleListSolution.secondPlayerDeck.size() == 0)
                return "first " + i;
            else {
                int firstCard = DoubleListSolution.firstPlayerDeck.remove(); //"Вынимаем" карты из колоды первого игрока
                int secondCard = DoubleListSolution.secondPlayerDeck.remove(); //"Вынимаем" карты из колоды второго игрока

                if (firstCard == 0 && secondCard == 9) //Побеждает ли первая карта "0" вторую карту "9"?
                {
                    DoubleListSolution.firstPlayerDeck.add(firstCard);
                    DoubleListSolution.firstPlayerDeck.add(secondCard);
                }
                else if (secondCard == 0 && firstCard == 9) //Побеждает ли вторая карта "0" первую карту "9"?
                {
                    DoubleListSolution.secondPlayerDeck.add(firstCard);
                    DoubleListSolution.secondPlayerDeck.add(secondCard);
                }
                else if (firstCard > secondCard) //В ином случае побеждает большая карта
                {
                    DoubleListSolution.firstPlayerDeck.add(firstCard);
                    DoubleListSolution.firstPlayerDeck.add(secondCard);
                }
                else {
                    DoubleListSolution.secondPlayerDeck.add(firstCard);
                    DoubleListSolution.secondPlayerDeck.add(secondCard);
                }
            }
        }
        return "botva"; //Если после 106 ходов игра не заканчивается, программа выводит слово botva
    }
}
