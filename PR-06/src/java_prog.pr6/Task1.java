package java_prog.pr6;

//Задание 1
//Сортировка вставками
public class Task1 {
    Student[] students = new Student[5]; //Массив объектов класса Student

    public Task1() //Конструктор
    {
        for (int i = 0; i < 5; i++) //Генерирация случайных ID студентов
            students[i] = new Student((int)(Math.random() * 999));

        System.out.println("Random generated students:"); //Вывод массива
        for (Student temp : students)
            System.out.print(temp.getIDNumber() + " ");
        System.out.println("\n");

        for (int i = 1; i < 5; i++) //Сортировка массива вставками
            for (int j = i; j > 0; j--)
                if (students[j].getIDNumber() < students[j - 1].getIDNumber()) {
                    Student tmp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = tmp;
                }

        System.out.println("Sorted array of students:"); //Выводим результата
        for (Student temp : students)
            System.out.print(temp.getIDNumber() + " ");
        System.out.println("\n");
    }
}
