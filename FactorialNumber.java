package JavaCoding;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int factorial = findFactorial(num);
        System.out.println(factorial);
    }
    static int findFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
