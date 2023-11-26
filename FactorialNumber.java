package JavaCoding;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = findFactorial(num);
        System.out.println(factorial);
        sc.close();
    }
    static int findFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
