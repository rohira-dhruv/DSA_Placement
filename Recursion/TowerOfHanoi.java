import java.util.Scanner;

public class TowerOfHanoi {

    //To solve this, Think of this as for every N disc transfer, you first have to somehow transfer the N-1 smaller discs to the 
    //auxiliary tower(B) and then move the largest disc to the target tower (C). Now move all those n-1 discs similarly from B to 
    // target tower C using A as auxiliary tower. so remove n-2 discs and so on.

    static void tower(int n, char a, char b, char c) {
        if(n == 1) {
            System.out.println("Move 1 from "+a+" to "+c);
            return;
        }
        tower(n-1, a, c, b);
        System.out.println("Move "+n+" from "+a+" to "+c);
        tower(n-1, b, a, c);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        tower(num, 'A', 'B', 'C');
        sc.close();
    }
}
