import java.util.Scanner;
public class OddOccuringNumber {

    int oddOccuring(int arr[], int n) {
        int ans = 0;
        for (int i=0; i<n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        OddOccuringNumber obj = new OddOccuringNumber();
        int ans = obj.oddOccuring(arr, size);
        System.out.println(ans);
        sc.close();
    }
    
}
