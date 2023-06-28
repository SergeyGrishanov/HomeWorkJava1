// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Work_1 {
    static int getTriangNumb(int num) {
        int sum = 0;
        for (int index = 0; index < num; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int num) {
        int Nfactorial = 1;
        for (int index = 0; index < num; index++) {
            Nfactorial *= index + 1;
        }
        return Nfactorial;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Выввели не натуральное число!");            
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Вы ввлели отрицательное число!");
            else {
                System.out.printf("Треуголное число: %d это: %s! ", n, getTriangNumb(n));
                System.out.println();
                System.out.printf("Факториал от n = %d это: %s! ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}
