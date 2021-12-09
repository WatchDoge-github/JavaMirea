package java_prog.pr6;

//Задание 2
//Сортировка списка студентов по итоговым баллам
public class SortingStudentsByGPA implements Comparator{
    Student students[] = new Student[10]; //Массив класса Student

    public SortingStudentsByGPA() //Конструктор
    {
        for (int i = 0; i < 10; i++) //Генерирация случайных ID студентов
            students[i] = new Student(i, (int)(Math.random() * 10));

        System.out.println("Random generated students:"); //Вывод массива
        for (Student i : students)
            System.out.print(i.getGPA() + " ");
        System.out.println("\n");

        Comparator.sort(students,0,9); //Быстрая сортировка массива

        System.out.println("Sorted array of students:"); //Вывод результата
        for (Student i : students)
            System.out.print(i.getGPA() + " ");
        System.out.println("\n");
    }
}
