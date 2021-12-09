package java_prog.pr10;

class Ping implements Runnable //Класс Ping
{
    @Override
    public void run() {
        while (true) {
            System.out.println("Ping"); //Вывод "Ping"
            try {
                Thread.sleep(500); //Задержка потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Pong implements Runnable //Класс Pong
{
    @Override
    public void run() {
        while (true) {
            System.out.println("Pong"); //Вывод "Pong"
            try {
                Thread.sleep(500); //Задержка потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithread {
    public static void main(String[] args) //Функция main
    {
        Ping ping = new Ping(); //Запуск "Ping" в отдельном потоке
        Thread pingObj = new Thread(ping);
        pingObj.start();

        Pong pong = new Pong(); //Запуск "Pong" в отдельном потоке
        Thread pongObj = new Thread(pong);
        pongObj.start();
    }
}