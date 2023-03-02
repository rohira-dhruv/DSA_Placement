import java.util.*;

public class KthBit {

    void kthbit(int n, int k) {
        
        if(((1 << (k-1)) & n) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        KthBit obj = new KthBit();
        obj.kthbit(num, k);

        sc.close();
    }
}