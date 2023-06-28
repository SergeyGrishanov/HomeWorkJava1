//Вывести все простые числа от 1 до 1000

package work2;

public class Work2 {
    static boolean isNumberPrime(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0 )
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        StringBuilder primeNumb = new StringBuilder();
        primeNumb = primeNumb.append("1");
        for (int i = 2; i < 1000; i++) {
            if (isNumberPrime(i))
                primeNumb = primeNumb.append(", ").append(i);
        }
    System.out.println("Простые числа от 1 до 1000:");   
    System.out.println(primeNumb);   
    }
}