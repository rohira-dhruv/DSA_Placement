import java.util.Scanner;

public class SumOfDigits {

    static int digiSum(int n) {
        if(n == 0) return 0;
        return n%10 + digiSum(n/10);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digiSum(num));
        sc.close();
    }
}
