// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package work4;

import java.util.Scanner;


public class work4 {
    static boolean rightEformula(String q, String w, String e) {
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);
        if (a + b == c) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите числа уравления с неизвестными числами (?) (q + w = e): ");
        String num = scn.nextLine();
        num = num.replace(" ", "");
        String[] numbersArray = num.split("[+=]");
        boolean correctEnter = true;

        for (String element : numbersArray) {
            element = element.replace("?", "0");
            int number = Integer.parseInt(element);
            if (number < 0) {
                correctEnter = false;
                break;
            }           
        }

        if (!correctEnter || numbersArray.length != 3) {
            System.out.println("Нет решения!");
        } else {
            boolean isSolution = false;
            for (int x = 0; x < 10; x++) {
                String[] tempArray = numbersArray.clone();
                
                for (int i = 0; i < 3; i++) {
                    String c = Integer.toString(x);
                    tempArray[i] = tempArray[i].replace("?", c);
                }

                if (rightEformula(tempArray[0], tempArray[1], tempArray[2])) {
                    System.out.printf("%s + %s = %s", tempArray[0], tempArray[1], tempArray[2]);
                    isSolution = true;
                    break;
                }                
            }
            if (! isSolution) {
               System.out.println("Нет решения!"); 
            } 
        }
        scn.close();
    }
}
