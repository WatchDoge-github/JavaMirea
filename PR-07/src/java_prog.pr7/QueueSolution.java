package java_prog.pr7;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSolution {
    private static Queue<Integer> firstPlayerDeck; //Переменные колод первого игрока
    private static Queue<Integer> secondPlayerDeck; //Переменные колод второго игрока

    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) //Метод определения победителя
    {
        //Инициализация переменных:
        QueueSolution.firstPlayerDeck = new LinkedList<>();
        QueueSolution.secondPlayerDeck = new LinkedList<>();

        //Данные о колодах в коллекции:
        for (int i = 0; i < 5; i++) {
            QueueSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            QueueSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            //Если у первого игрока закончились карты, то второй побеждает. Если у второго игрока закончились карты, то первый побеждает. В ином случае выводится старшая карта.
            if (QueueSolution.firstPlayerDeck.size() == 0)
                return "second " + i;
            else if (QueueSolution.secondPlayerDeck.size() == 0)
                return "first " + i;
            else {
                int firstCard = QueueSolution.firstPlayerDeck.remove(); //"Вынимаем" карты из колоды первого игрока
                int secondCard = QueueSolution.secondPlayerDeck.remove(); //"Вынимаем" карты из колоды второго игрока

                if (firstCard == 0 && secondCard == 9) //Побеждает ли первая карта "0" вторую карту "9"?
                {
                    QueueSolution.firstPlayerDeck.add(firstCard);
                    QueueSolution.firstPlayerDeck.add(secondCard);
                }
                else if (secondCard == 0 && firstCard == 9) //Побеждает ли вторая карта "0" первую карту "9"?
                {
                    QueueSolution.secondPlayerDeck.add(firstCard);
                    QueueSolution.secondPlayerDeck.add(secondCard);
                }
                else if(firstCard > secondCard) //В ином случае побеждает большая карта
                {
                    QueueSolution.firstPlayerDeck.add(firstCard);
                    QueueSolution.firstPlayerDeck.add(secondCard);
                }
                else {
                    QueueSolution.secondPlayerDeck.add(firstCard);
                    QueueSolution.secondPlayerDeck.add(secondCard);
                }
            }
        }
        return "botva"; //Если после 106 ходов игра не заканчивается, программа выводит слово botva
    }
}
