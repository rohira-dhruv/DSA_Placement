import java.util.Scanner;

public class SubsetSum {

    static int countSubset(int []arr, int n, int sum) {

        if(n==0){
            return (sum == 0)? 1:0;
        }

        return countSubset(arr, n-1, sum) + countSubset(arr, n-1, sum-arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(countSubset(arr, size, sum));
        sc.close();
    }    
}
