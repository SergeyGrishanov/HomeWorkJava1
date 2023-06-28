//Реализовать простой калькулятор
//Пример: 
// Введите число 1: 5
// Введите число 2: 7
//Введите оператор (+ - / *): +
// Ваш ответ: 12 (свитч - кейс)

package work3;
import java.util.Scanner;
public class Work3 {
    static void printResultOperation(int a, int b, String signOperation) {
        switch (signOperation) {
        case "+":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, a + b);
            break;
        case "-":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, a - b);
            break;
        case "*":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, a * b);
            break;
        case "/":
            if (b != 0) {
                System.out.printf("%d %s %d = %.1f \n", a, signOperation, b, ((double) a / (double) b));
            } else {
                System.out.println("ERROR: Деление на 0!");
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        int a = 0;
        if (!scn.hasNextInt()) {
            System.out.println("Вы ввели не число!");
        } else {
            a = scn.nextInt();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Введите оператор: +, -, *, / \n");
            String signOperation = "";
            if (sc.hasNextLine()) {
                signOperation = sc.nextLine();
            }
            if (signOperation.equals("+") || signOperation.equals("-") || signOperation.equals("*")
                    || signOperation.equals("/")) {
                int b = 0;
                System.out.printf("Введита число 2: ");
                if (!scn.hasNextInt()) {
                    System.out.println("Вы ввели не число!");
                } else {
                    b = scn.nextInt();
                    printResultOperation(a, b, signOperation);
                }
            } else {
                System.out.println("Выввели неверный оператор!");
            }
            scn.close();
            sc.close();
        }
    }
}

