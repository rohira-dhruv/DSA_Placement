import java.util.Scanner;
public class TwoOddOccuring {

    int[] twoOddOccuring(int arr[], int n) {

        //XOR of all numbers in the array
        //find last set bit of XOR -> last unequal bit in two target numbers.
        //divide array in two groups- one with set bit and other with unset bit.
        //find xor of subarrays.
        //xor of two target numbers will be the result.
        
        int xor = 0;
        for(int i=0; i<n; i++) {
            xor = xor ^ arr[i];
        }
        int setBit = xor & ~(xor-1);
        int res1 = 0, res2 = 0;
        for(int i=0; i<n; i++) {
            if((arr[i] & setBit) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        return new int[] {res1, res2};
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        TwoOddOccuring obj = new TwoOddOccuring();
        int ans[] = obj.twoOddOccuring(arr, size);
        System.out.println(ans[0] + " " + ans[1]);

        sc.close();
    }
}
