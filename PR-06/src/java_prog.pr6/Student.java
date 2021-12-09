package java_prog.pr6;

public class Student{
    private int iDNumber; //ID студента
    private int GPA; //Итоговый средний балл студента

    public Student (int id) {
        this.iDNumber = id;
    } //Параметризированный конструктор

    public Student(int id,int mark) //Параметризированный конструктор
    {
        this.iDNumber = id;
        this.GPA = mark;
    }

    public int getGPA() {
        return GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }
}