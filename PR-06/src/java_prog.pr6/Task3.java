package java_prog.pr6;

//Задание 3
//Объединение двух списков данных о студентах
public class Task3 {
    void printStudents(Student[] students) //Вывод массива на экран
    {
        for (Student student : students)
            System.out.print(student.getIDNumber() + " ");
        System.out.println("\n");
    }

    public Task3() //Конструктор
    {
        Student[] students1 = new Student[10]; //Инициализация первого массива
        Student[] students2 = new Student[10]; //Инициализация второго массива
        Student[] result = new Student[20]; //Инициализация итогового массива

        for (int i = 0; i < 10; i++) //Генерирация случайных ID студентов
        {
            students1[i] = new Student((int) (Math.random() * 999));
            students2[i] = new Student((int) (Math.random() * 999));
        }

        System.out.println("Random arrays of students (1 and 2): "); //Вывод массива
        printStudents(students1);
        printStudents(students2);

        mergeArrays(students1, students2, result,10,10); //Сортировка массивов
        mergeSort(result,20); //Объединение массивов

        printStudents(result); //Вывод результата
    }

    //Объединение массивов:
    public static void mergeArrays(Student[] leftStudents, Student[] rightStudents, Student[] result, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right)
            if (leftStudents[i].getIDNumber()
                    <= rightStudents[j].getIDNumber())
                result[k++] = leftStudents[i++];
            else
                result[k++] = rightStudents[j++];

        while (i < left)
            result[k++] = leftStudents[i++];
        while (j < right)
            result[k++] = rightStudents[j++];
    }

    public static void mergeSort(Student[] result, int n) //Метод объединения-сортировки массива
    {
        if (n <= 1) //Выполнение функции прерывается, если всё отсортировано
            return;

        int m = n / 2; //Нахождение среднего опорного элемента

        Student[] leftStudents = new Student[m]; //Вспомогательный массив
        Student[] rightStudents = new Student[n - m]; //Вспомогательный массив

        for (int i = 0; i < m; i++)
            leftStudents[i] = result[i];

        for (int i = m; i < n; i++)
            rightStudents[i - m] = result[i];

        //Рекурсивная сортировка левого и правого массива
        mergeSort(leftStudents, m); //Рекурсивная сортировка левого массива
        mergeSort(rightStudents, n - m); //Рекурсивная сортировка правого массива

        //Объединение массивов
        mergeArrays(result, leftStudents, rightStudents, m, n - m);
    }
}