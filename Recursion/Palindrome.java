import java.util.Scanner;

public class Palindrome {

    static boolean isPal(String str, int start, int end) {
        if (start >= end)
            return true;
        
        return (str.charAt(start) == str.charAt(end)) && isPal(str, start+1, end-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        if(isPal(str, 0, str.length()-1)) {
          System.out.println("Yes");
        }
        else System.out.println("No");
        sc.close();
    }
    
}
