import java.util.Scanner;

public class SumOfN {

    static int sum(int n) {
        if(n==1) return 1;
        return n + sum(n-1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sum(num));
        sc.close();
    }
}
