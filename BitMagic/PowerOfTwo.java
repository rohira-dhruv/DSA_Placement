import java.util.*;
public class PowerOfTwo {

    boolean check(int n) {
        if (n == 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PowerOfTwo p = new PowerOfTwo();
        if (p.check(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
