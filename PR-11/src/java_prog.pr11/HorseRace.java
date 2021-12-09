package java_prog.pr11;

class HorseRaces {
    public static void main(String[] args) {
        int n = 5; //Кол-во лошадей
        System.out.println("Несинхронизированные потоки: ");
        UnSyncRunner unsyncrunner = new UnSyncRunner(); //Запуск в отдельном потоке
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(unsyncrunner);
            thread.setName(" Лошадь " + (i + 1));
            thread.start();
        }
        try {
            Thread.sleep(100); //Задержка потока
        } catch (InterruptedException e) {
        }
        System.out.println("Синхронизированные потоки: ");
        SyncRunner syncrunner = new SyncRunner(); //Запуск в отдельном потоке
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(syncrunner);
            thread.setName(" Лошадь " + (i + 1));
            thread.start();
        }
    }
}

class UnSyncRunner implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " стартовала");
        try {
            Thread.sleep(10); //Задержка потока
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " финишировала");
    }
}

class SyncRunner implements Runnable {
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " стартовала");
        try {
            Thread.sleep(10); //Задержка потока
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " финишировала");
    }
}
