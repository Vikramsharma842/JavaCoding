package JavaCoding;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int num = sc.nextInt();
        int output = reverseOfNumber(num);
        System.out.println(output);
        sc.close();
    }

    static int reverseOfNumber(int num){
        int output = 0;
        int r;
        while(num>0){
            r = num%10;
            output = output * 10 + r;
            num = num/10;
        }
        return output ;
    }
    
}
