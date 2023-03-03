import java.util.Scanner;

public class Permutations {

    static String swap(String s, int i, int j) {
        if (i < j) {
            return s.substring(0, i) + s.charAt(j) + s.substring(i+1, j) + s.charAt(i) + s.substring(j+1);
        }
        else if(j < i) return s.substring(0, j) + s.charAt(i) + s.substring(j+1, i) + s.charAt(j) + s.substring(i+1);
        else return s;
    }
    
    static void permute(String s, int index) {
        if(index == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for(int j=index; j<s.length(); j++){
            s = swap(s, index, j);
            permute(s, index+1);
            s = swap(s, index, j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permute(str, 0);
        sc.close();
    }
}
