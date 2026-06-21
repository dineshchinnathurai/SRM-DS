// LongestIncreasingSubsequence 
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for(int i = 1; i < n; i++) {

            for(int j = 0; j < i; j++) {

                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = dp[0];

        for(int i = 1; i < n; i++) {
            if(dp[i] > maxLength) {
                maxLength = dp[i];
            }
        }

        System.out.println("Length of LIS = " + maxLength);

        sc.close();
    }
}

// my update