import java.util.*;
public class PowerSet {

    void generatePowerSet(String str) {
        int n = str.length();
        int pow = (int)Math.pow(2, n);
        for(int i=0; i<pow; i++) {
            for(int j=0; j<n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();

        PowerSet obj = new PowerSet();
        obj.generatePowerSet(str);

        sc.close();
    }
}
