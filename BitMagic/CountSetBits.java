import java.util.*;
public class CountSetBits {

    static int table[] = new int[256];
     
    void initialize () {
        table[0] = 0;
        for(int i=1; i<256; i++) {
            table[i] = (i & 1) + table[i/2];
        }
        // System.out.println(table[1]);
    }

    int count(int n) {

        int res = table[n & 127];
        n = n >> 8;
        res = res + table[n & 127];
        n = n >> 8;
        res = res + table[n & 127];
        n = n >> 8;
        res = res + table[n & 127];
        return res;
    }

    int getSetBitCount(int n) {
        int count = 0;
        while(n!=0) {
            n = n & (n-1);
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        CountSetBits c = new CountSetBits();
        int count = c.getSetBitCount(num);
        System.out.println(count);

        c.initialize();
        // System.out.println(table[2]);
        System.out.println(c.count(num));
        sc.close();
    }
}
