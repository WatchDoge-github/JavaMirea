//9. Без двух нулей
//Даны числа a и b. Определите, сколько существует последовательностей из a нулей и b единиц, в которых никакие два нуля не стоят рядом.


package java_prog.pr5;

public class No9 {
    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(recursion(5, 8)); // вызов рекурсивной функции и ввод значений переменных
    }
}