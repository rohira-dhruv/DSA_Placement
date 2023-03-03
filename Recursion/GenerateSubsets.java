import java.util.Scanner;

public class GenerateSubsets {

    static void generateSubsets(String s, String curr, int index) {
        if(index == s.length()) {
            System.out.println(curr);
            return;
        }

        generateSubsets(s, curr, index+1);
        generateSubsets(s, curr + s.charAt(index), index+1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        generateSubsets(str, "", 0);
        sc.close();
    }
}
