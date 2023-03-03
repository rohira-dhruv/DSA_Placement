import java.util.Scanner;

public class RopeCutting {

    static int maxPieceCount(int n, int a, int b, int c) {

        if(n < 0) return -1;

        if (n == 0) return 0;

        int res = Math.max(Math.max(maxPieceCount(n-a, a, b, c), maxPieceCount(n-b, a, b, c)), maxPieceCount(n-c, a, b, c));

        if (res == -1) return -1;
        return res+1;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maxPieceCount(n, a, b, c));
        sc.close();
    }
}
