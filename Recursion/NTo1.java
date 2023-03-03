import java.util.Scanner;

public class NTo1 {

    static void fun(int n) {
        
        if(n == 0) 
        return;

        System.out.print(n + " ");
        fun(n-1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fun(num);
        sc.close();
    }
}
