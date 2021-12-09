package java_prog.pr7;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSolution {
    private static Deque<Integer> firstPlayerDeck; //Переменные колод первого игрока
    private static Deque<Integer> secondPlayerDeck; //Переменные колод второго игрока

    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) //Метод определения победителя
    {
        //Инициализация переменных:
        DequeSolution.firstPlayerDeck = new ArrayDeque<>();
        DequeSolution.secondPlayerDeck = new ArrayDeque<>();

        //Данные о колодах в коллекции:
        for (int i = 0; i < 5; i++) {
            DequeSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            DequeSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            //Если у первого игрока закончились карты, то второй побеждает. Если у второго игрока закончились карты, то первый побеждает. В ином случае выводится старшая карта.
            if (DequeSolution.firstPlayerDeck.size() == 0)
                return "second "+i;
            else if (DequeSolution.secondPlayerDeck.size()== 0)
                return "first "+i;
            else {
                int firstCard = DequeSolution.firstPlayerDeck.remove(); //"Вынимаем" карты из колоды первого игрока
                int secondCard = DequeSolution.secondPlayerDeck.remove(); //"Вынимаем" карты из колоды второго игрока

                if (firstCard == 0 && secondCard == 9) //Побеждает ли первая карта "0" вторую карту "9"?
                {
                    DequeSolution.firstPlayerDeck.add(firstCard);
                    DequeSolution.firstPlayerDeck.add(secondCard);
                }
                else if (secondCard == 0 && firstCard == 9) //Побеждает ли вторая карта "0" первую карту "9"?
                {
                    DequeSolution.secondPlayerDeck.add(firstCard);
                    DequeSolution.secondPlayerDeck.add(secondCard);
                }
                else if(firstCard > secondCard) //В ином случае побеждает большая карта
                {
                    DequeSolution.firstPlayerDeck.add(firstCard);
                    DequeSolution.firstPlayerDeck.add(secondCard);
                }
                else {
                    DequeSolution.secondPlayerDeck.add(firstCard);
                    DequeSolution.secondPlayerDeck.add(secondCard);
                }
            }
        }
        return "botva"; //Если после 106 ходов игра не заканчивается, программа выводит слово botva
    }
}
