package java_prog.pr6;

public interface Comparator {
    public static void sort(Student[] students, int low, int high) {

        if (students.length == 0) //Если длина массива равняется 0, выполнение функции прерывается
            return;

        if (low >= high) //Если низший порог совпадает с высшим, выполнение функции прерывается
            return;


        int m = low + (high - low) / 2; //Нахождение среднего элемента в массиве
        int temp = students[m].getGPA(); //Выбор ключевого элемента на основе среднего

        int i = low; //Меньший масив (меньше ключевого элемента)
        int j = high;//Больший масив (больше опорного элемента)

        while (i <= j) //Сортировка студентов по убыванию
        {
            while (students[i].getGPA() > temp)
                i++;

            while (students[j].getGPA() < temp)
                j--;

            // Меняем элементы местами
            if (i <= j) {
                Student s = students[i];
                students[i] = students[j];
                students[j] = s;

                i++; //Инкрементируем индекс i
                j--; //Декрементируем индекс j
            }
        }

        //Сотрировка:
        if (low < j)
            sort(students, low, j);
        if (high > i)
            sort(students, i, high);
    }
}
