import java.util.Scanner;

public class JosephusProblem {

    static int josephus(int n, int k) {

        if (n==1) return 0;
    
        return (josephus(n-1, k) + k) % n;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephus(num, k));
        sc.close();     
    }
}
