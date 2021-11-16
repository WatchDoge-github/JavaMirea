//10. Разворот числа
//Дано число n, десятичная запись которого не содержит нулей. Получите число, записанное теми же цифрами, но в противоположном порядке.


package java_prog.pr5;

public class No10 {
    public static int recursion(int n, int a) {
        if (n == 0) {
            return a;
        }
        else {
            return recursion(n / 10, 10 * a + n % 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(123456789, 0)); // вызов рекурсивной функции и ввод значений переменных
    }
}


